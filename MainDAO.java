package app;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Catalogo;
import entities.Libri;
import entities.Period;
import entities.Prestito;
import entities.Riviste;
import entities.Utente;

public class MainDAO {

	private static final String persistenceUnit = "Progetto3";
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory(persistenceUnit);
	private static final EntityManager em = emf.createEntityManager();
	private static final EntityTransaction t = em.getTransaction();
	
	public void insertLibro(long isbn, String title, int year, int numOfPages, String author, String genre) {
		
//		Random rnd = new Random();
//		char c = (char) ('a' + rnd.nextInt(26));
		
		try {
			
			Libri l = new Libri(isbn, title, year, numOfPages, author, genre);
			
			t.begin();
			em.persist(l);
			t.commit();
			
			System.out.println("Dati libro inseriti correttamente!");
			
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Errore durante l'inserimento dati libro");
		}
		
	}
	
	public void inseriscitRivista(long isbn, String title, int releaseYear, int numOfPages, Period period ) {
		
		try {
			
			Riviste r = new Riviste(isbn, title, releaseYear, numOfPages, period);
		
			t.begin();
			em.persist(r);
			t.commit();
			
			System.out.println("Dati rivista inseriti correttamente!");
			
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Errore durante l'inserimento dati rivista");
		}
		
	}
	
	public void inseriscitUtente(String name, String surname, int anno, int mese, int giorno, long numTessera) {
		
		try {
			
			Utente u = new Utente(name, surname, LocalDate.of(anno, mese, giorno), numTessera);
		
			t.begin();
			em.persist(u);
			t.commit();
			
			System.out.println("Dati utente inseriti correttamente!");
			
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Errore durante l'inserimento dati utente");
		}
		
	}
	
	public void inserisciPrestito(int utente_id, int elemento_id, int anno, int mese, int giorno ) {
		
		try {
			Utente u = em.find(Utente.class, utente_id);
		
			Catalogo c = em.find(Catalogo.class, elemento_id);
		
			if(u == null) return;
		
			if(c == null) return;
		
			Prestito p = new Prestito(u, c, LocalDate.now(), LocalDate.of(anno, mese, giorno));
		
			t.begin();
			em.persist(p);
			t.commit();

			System.out.println("Dati prestito inseriti correttamente!");
			
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Errore durante l'inserimento dati prestito");
		}
		
	}
	
	public void eliminaElementoPerISBN(long isbn) {
		Query q = em.createQuery("SELECT c FROM Catalogo c WHERE code = :n");
		q.setParameter("n", isbn);
		List<Catalogo> result = q.getResultList();
		
		if(result.isEmpty()) {
			System.out.println("For ISBN code: " + isbn + " --> element not found!");
		} else {
			for (Catalogo c: result ) {
				try {
					t.begin();
					em.remove(c);
					t.commit();
					
					System.out.println( "Evento con id " + isbn + " è stato eliminato!" );
				} catch(Exception e) {
					System.out.println(e.toString());
				}				
			}
		}
		
	}
	
	public void getElementoPerISBN(long isbn) {
		Query q = em.createQuery("SELECT c FROM Catalogo c WHERE code = :n");
		q.setParameter("n", isbn);
		List<Catalogo> result = q.getResultList();
		
		if(result.isEmpty()) {
			System.out.println("For ISBN code: " + isbn + " --> element not found!");
		} else {
			for (Catalogo c: result ) {
				System.out.println("For ISBN code: " + isbn);
				System.out.println(c);
			}
		}
	}
	
	public void getElementoPerAnno(int releaseYear) {
		Query q = em.createQuery("SELECT c FROM Catalogo c WHERE date = :n");
		q.setParameter("n", releaseYear);
		List<Catalogo> result = q.getResultList();
		
		if(result.isEmpty()) {
			System.out.println("Per data pubblicazione: " + releaseYear + " --> element not found!");
		} else {
			for (Catalogo c: result ) {
				System.out.println("Per data pubblicazione: " + releaseYear);
				System.out.println(c);
			}
		}
	}
	
	public void getElementoPerAutore(String author) {
		Query q = em.createQuery("SELECT c FROM Catalogo c WHERE autore LIKE :n ");
		q.setParameter("n", "%" + author + "%");
		List<Catalogo> result = q.getResultList();
		
		if(result.isEmpty()) {
			System.out.println("Per autore: " + author + " --> element not found!");
		} else {
			for (Catalogo c: result ) {
				System.out.println("Per autore: " + author);
				System.out.println(c);
			}
		}
	}
	
	public void getElementoPerTitolo(String title) {
		Query q = em.createQuery("SELECT c FROM Catalogo c WHERE titolo LIKE :n ");
		q.setParameter("n", "%" + title + "%");
		List<Catalogo> result = q.getResultList();
		
		if(result.isEmpty()) {
			System.out.println("Per titolo/titolo parziale: " + title + " --> element not found!");
		} else {
			for (Catalogo c: result ) {
				System.out.println("Per titolo/titolo parziale: " + title);
				System.out.println(c);
			}
		}
	}
	
	public void close() {
		em.close();
		emf.close();
	}
	
}