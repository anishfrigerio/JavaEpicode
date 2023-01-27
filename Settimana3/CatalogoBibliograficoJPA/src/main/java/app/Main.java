
package app;

import entities.Period;

public class Main {

	public static void main(String[] args) {
	
		
		MainDAO e = new MainDAO();
		
//		e.inserisciUtente("Anish", "Frigerio", 1999, 8, 22, 0011);
//		e.inserisciUtente("Giovanni", "Galatioto", 1991,7, 18, 0012);
//		e.inserisciUtente("Jiuse", "Neri", 1996, 23, 6, 0013);
//		
//		e.inserisciLibro(101, "Harry Potter", 1997,300, "J.K. Rowling", "Fantascienza");
//		e.inserisciLibro(102, "Peter Pan", 1976, 350, "Peter", "Fantascienza");
//		e.inserisciLibro(103, "Signore degli Anelli", 1999, 400, "Tolkien", "Fantascienza");
//		
//		
//		e.inserisciRivista(104, "Focus", 2016, 40, Period.MENSILE);
//		e.inserisciRivista(105, "Playboy",2018, 50, Period.SETTIMANALE);
//		e.inserisciRivista(106, "Time",2023,47, Period.SEMESTRALE);
//		
//		e.inserisciPrestito(1, 4, 2023, 3, 12);
//		e.inserisciPrestito(2, 3, 2023, 2, 19);
//		e.inseriscitPrestito(3, 1, 2023, 4, 1);
//		
		
		e.getElementoPerISBN(101);
		e.getElementoPerISBN(102);
		
		e.getElementoPerAnno(2023);
		e.getElementoPerAnno(2000);
		
		e.getElementoPerAutore("Peter");
		
		e.getElementoPerTitolo("Harry Potter");
		e.getElementoPerTitolo("ciao");
		
		e.close();

	}

}