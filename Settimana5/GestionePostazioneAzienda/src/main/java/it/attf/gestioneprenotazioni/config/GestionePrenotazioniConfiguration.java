package it.attf.gestioneprenotazioni.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.attf.gestioneprenotazioni.entity.Edificio;
import it.attf.gestioneprenotazioni.entity.Postazione;
import it.attf.gestioneprenotazioni.entity.Prenotazioni;
import it.attf.gestioneprenotazioni.entity.Utente;
import it.attf.gestioneprenotazioni.model.TipoPostazione;

@Configuration
public class GestionePrenotazioniConfiguration {

	//EDIFICI
	
	@Bean
	public Edificio edi1() {
		Edificio e= Edificio.builder().nome("Palazzo1").indirizzo("Via Trieste 1").citta("Firenze").build();
		return e;
	}
	
	
	@Bean
	public Edificio edi2() {
		Edificio e= Edificio.builder().nome("Palazzo2").indirizzo("Via Como 2").citta("Roma").build();
		return e;
	}
	
	@Bean
	public Edificio edi3() {
		Edificio e= Edificio.builder().nome("Palazzo3").indirizzo("Via Firenze 5").citta("Pescara").build();
		return e;
	}
	
	@Bean
	public Edificio edi4() {
		Edificio e= Edificio.builder().nome("Palazzo4").indirizzo("Via Parigi 8").citta("Torino").build();
		return e;
	}
	
	//POSTAZIONI
	
	@Bean
	public Postazione pos1() {
		Postazione pos=Postazione.builder().codice("abcd").descrizione("Postazione 1")
				.tipo(TipoPostazione.PRIVATO).maxOccupanti(1).edificio(edi1()).build();
		return pos;
	}
	
	@Bean
	public Postazione pos2() {
		Postazione pos=Postazione.builder().codice("efgh").descrizione("Postazione 2")
				.tipo(TipoPostazione.OPENSPACE).maxOccupanti(20).edificio(edi1()).build();
		return pos;
	}
	
	@Bean
	public Postazione pos3() {
		Postazione pos=Postazione.builder().codice("ijkl").descrizione("Postazione 3")
				.tipo(TipoPostazione.SALARIUNIONI).maxOccupanti(5).edificio(edi2()).build();
		return pos;
	}
	
	@Bean
	public Postazione pos4() {
		Postazione pos=Postazione.builder().codice("mnop").descrizione("Postazione 4")
				.tipo(TipoPostazione.PRIVATO).maxOccupanti(1).edificio(edi3()).build();
		return pos;
	}
	
	@Bean
	public Postazione pos5() {
		Postazione pos=Postazione.builder().codice("qrst").descrizione("Postazione 5")
				.tipo(TipoPostazione.SALARIUNIONI).maxOccupanti(5).edificio(edi4()).build();
		return pos;
	}
	
	//UTENTI
	
	@Bean
	public Utente usr1() {
		Utente usr=Utente.builder().username("anish").nomeCompleto("Anish Frigerio")
				.email("anish@frigerio.it").build();
		return usr;
	}
	
	@Bean
	public Utente usr2() {
		Utente usr=Utente.builder().username("jiuse").nomeCompleto("Jiuse Seydi")
				.email("jiuse@seydi.it").build();
		return usr;
	}
	
	@Bean
	public Utente usr3() {
		Utente usr=Utente.builder().username("giovanni").nomeCompleto("Giovanni Galatioto")
				.email("gio@galatioto.it").build();
		return usr;
	}
	
	@Bean
	public Utente usr4() {
		Utente usr=Utente.builder().username("diego").nomeCompleto("Marina Muntenita")
				.email("marina@muntenita.it").build();
		return usr;
	}
	
	
	//PRENOTAZIONI
	
	@Bean
	public Prenotazioni preno1() {
		Prenotazioni preno=Prenotazioni.builder().dataPrenotazione(LocalDate.of(2023, 6, 7))
				.utentePrenotato(usr1()).postazionePrenotata(pos1()).build();
		return preno;

	}
	
	@Bean
	public Prenotazioni preno2() {
		Prenotazioni preno=Prenotazioni.builder().dataPrenotazione(LocalDate.of(2023, 5, 9))
				.utentePrenotato(usr2()).postazionePrenotata(pos2()).build();
		return preno;

	}
	
	@Bean
	public Prenotazioni pr3() {
		Prenotazioni preno=Prenotazioni.builder().dataPrenotazione(LocalDate.of(2023, 8, 9))
				.utentePrenotato(usr3()).postazionePrenotata(pos3()).build();
		return preno;

	}
	
}
