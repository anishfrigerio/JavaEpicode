package it.attf.gestioneprenotazioni;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.attf.gestioneprenotazioni.config.GestionePrenotazioniConfiguration;
import it.attf.gestioneprenotazioni.dao.EdificioRepository;
import it.attf.gestioneprenotazioni.dao.EdificioService;
import it.attf.gestioneprenotazioni.dao.PostazioneRepository;
import it.attf.gestioneprenotazioni.dao.PostazioneService;
import it.attf.gestioneprenotazioni.dao.PrenotazioniRepository;
import it.attf.gestioneprenotazioni.dao.PrenotazioniService;
import it.attf.gestioneprenotazioni.dao.UtenteRepository;
import it.attf.gestioneprenotazioni.dao.UtenteService;
import it.attf.gestioneprenotazioni.entity.Edificio;
import it.attf.gestioneprenotazioni.entity.Postazione;
import it.attf.gestioneprenotazioni.entity.Prenotazioni;
import it.attf.gestioneprenotazioni.entity.Utente;

@SpringBootApplication
public class PostazioneAziendaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PostazioneAziendaApplication.class, args);
	}
	
	@Autowired
	EdificioService edificioSe;
	
	@Autowired
	PostazioneService posSe;
	
	@Autowired
	PrenotazioniService prenoSe;
	
	@Autowired
	UtenteService utenteSe;
	
	@Autowired
	private EdificioRepository edificioRepo;
	
	@Autowired
	private PostazioneRepository posRepo;
	
	@Autowired
	private UtenteRepository utenteRepo;
	
	@Autowired
	PrenotazioniRepository prenoRepo;
	
	ApplicationContext ctx = new AnnotationConfigApplicationContext(GestionePrenotazioniConfiguration.class);
	
	@Override
	public void run(String... args) throws Exception {
		
		//Inserimento dati nel database
		inserisciEdifici();
		inserisciPostazioni();
		inserisciUtenti();
		inserisciPrenotazioni();

		
		//Ricerca postazione per tipo
//		trovaPostazioneDaTipo("OPENSPACE");
		
		//Ricerca postazione per citta
//		trovaPostazioneDaCitta("Roma");
		
		//Prenota una postazione
//		prePrenota();

		
		((AnnotationConfigApplicationContext)ctx).close();
		
	}
	
	public void inserisciEdifici() {
		
		Edificio edi1=(Edificio)ctx.getBean("ed1");
		edificioSe.inserisci(edi1);
		
		Edificio edi2=(Edificio)ctx.getBean("ed2");
		edificioSe.inserisci(edi2);
		
		Edificio edi3=(Edificio)ctx.getBean("ed3");
		edificioSe.inserisci(edi3);
		
		Edificio edi4=(Edificio)ctx.getBean("ed4");
		edificioSe.inserisci(edi4);
	}
	
	public void inserisciPostazioni() {
		Postazione pos1=(Postazione)ctx.getBean("pos1");
		posSe.inserisciPos(pos1);
		
		Postazione pos2=(Postazione)ctx.getBean("pos2");
		posSe.inserisciPos(pos2);
		
		Postazione pos3=(Postazione)ctx.getBean("pos3");
		posSe.inserisciPos(pos3);
		
		Postazione pos4=(Postazione)ctx.getBean("pos4");
		posSe.inserisciPos(pos4);
		
		Postazione pos5=(Postazione)ctx.getBean("pos5");
		posSe.inserisciPos(pos5);
	}
	
	public void inserisciUtenti() {
		Utente usr1=(Utente)ctx.getBean("usr1");
		utenteSe.inserisciUtente(usr1);
		
		Utente usr2=(Utente)ctx.getBean("usr2");
		utenteSe.inserisciUtente(usr2);
		
		Utente usr3=(Utente)ctx.getBean("usr3");
		utenteSe.inserisciUtente(usr3);
		
		Utente usr4=(Utente)ctx.getBean("ut4");
		utenteSe.inserisciUtente(usr4);
	}
	
	public void inserisciPrenotazioni() {
		Prenotazioni preno1=(Prenotazioni)ctx.getBean("preno1");
		prenoSe.inserisciPreno(preno1);
		
		Prenotazioni preno2=(Prenotazioni)ctx.getBean("preno2");
		prenoSe.inserisciPreno(preno2);
		
		Prenotazioni preno3=(Prenotazioni)ctx.getBean("preno3");
		prenoSe.inserisciPreno(preno3);
	}
	
	
	//Ricerca postazione per tipo
	public void trovaPostazioneDaTipo(String tipo) {
		posRepo.findByTipo(tipo).forEach((pos)->{
			System.out.println("-----------");
			System.out.println(pos.getCodice()+" "+pos.getDescrizione());
			System.out.println("-----------");
		});
		
	}
	
	//Ricerca postazione per città
	public void trovaPostazioneDaCitta(String citta) {
		List<Edificio> edi = new ArrayList<Edificio>();
		edificioRepo.findByCitta(citta).forEach((el)->{
			edi.add(el);
		});
		List<Integer> ide=new ArrayList<Integer>();
		edi.forEach((el)->{
			ide.add(el.getId());
		});
		List<Postazione> pos=new ArrayList<Postazione>();
		ide.forEach((el)->{
			pos.addAll(posRepo.cercaDaEdificioId(el));
		});
		pos.forEach((el)->{
			System.out.println("***********");
			System.out.println(el.getCodice()+" "+el.getDescrizione());
			System.out.println("***********");
		});
	}
	
	//Prenota postazione
	public void prePrenota() {

		List<Utente> lisUt=new ArrayList<Utente>();
		utenteRepo.cercaDaId(4).forEach((el)->{
			lisUt.add(el);
		});

		List<Postazione> lisPos=new ArrayList<Postazione>();
		posRepo.cercaDaId(5).forEach((el)->{
			lisPos.add(el);
		});
		int pos=lisPos.get(0).getId();
		int usr=lisUt.get(0).getId();
		LocalDate data=LocalDate.of(2023, 7, 7);
		prenota(data, usr, pos);
	}
	
	public void prenota(LocalDate data, int utente, int postazione) {
		List<Prenotazioni> pre=new ArrayList<Prenotazioni>();
		prenoRepo.findByDataPrenotazione(data).forEach((el)->{
			pre.add(el);
		});
		if(pre.isEmpty()) {
			System.out.println("Non ci sono prenotazioni in questa data");
		}
		else {
			List<Prenotazioni> pre2=new ArrayList<Prenotazioni>();
			pre.forEach((el)->{
				if(el.getId()!=utente) {
					pre2.add(el);
					prenotaSeconda(data, utente, postazione, pre2);
				}
				else {
					System.out.println("Hai gia prenotato");
				}
			});
		}
	}
	
	public void prenotaSeconda(LocalDate data,int utente,int postazione, List<Prenotazioni> pre) {
		pre.forEach((el)->{
			if(el.getId()!=postazione) {
				System.out.println("Non ci sono prenotazioni in questa postazione");
			}
			else {
				System.out.println("Occupata, non puoi prenotare");
			}
		});
	}

}