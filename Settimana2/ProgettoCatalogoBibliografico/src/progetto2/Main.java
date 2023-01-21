/**
 * 
 */
package progetto2; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
/**
 * @author anishfrigerio1999
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	List<Catalogue> cat = new ArrayList<Catalogue>();
		 	Scanner input = new Scanner(System.in);
		 	int scelta = 0;
		 	do {
		 		System.out.println("---------------------------MENU--------------------------");
		 		System.out.println(" 0.Chiudi Programma \n 1.Aggiungi Libro \n 2.Aggiungi Rivista \n 3.Rimuovi con ISBN \n 4.Cerca con ISBN \n 5.Cerca con Autore \n 6.Cerca con Anno di Uscita \n 7.Mostra dati salvati");
		 		scelta = input.nextInt();
		 		switch(scelta) {
		 		case 0:
		 			System.out.println("Programma chiusa");
		 			break;
		 		case 1:
		 			System.out.println("Inserisci codice ISBN");
		 			long isbn = input.nextLong();
		 			input.nextLine();
		 			System.out.println("Inserisci titolo");
		 			String title = input.nextLine();
		 			System.out.println("Inserisci l'anno di pubblicazione");
		 			int year = input.nextInt();
		 			System.out.println("Inserisci il numero delle pagine");
		 			int pages = input.nextInt();
		 			input.nextLine();
		 			System.out.println("Inserisci  l'autore");
		 			String author = input.nextLine();
		 			System.out.println("Inserisci il genere");
		 			String genre = input.next();
		 			addBook(cat,isbn,title,year,pages,author,genre);
		 			break;
		 		case 2:
		 			System.out.println("Inserisci codice ISBN");
		 			long isbn2 = input.nextLong();
		 			input.nextLine();
		 			System.out.println("Inserisci titolo");
		 			String title2 = input.nextLine();
		 			System.out.println("Inserisci l'anno di pubblicazione");
		 			int year2 = input.nextInt();
		 			System.out.println("Inserisci il numero delle pagine");
		 			int pages2 = input.nextInt();
		 			System.out.println("Inserisci periodicità");
		 			Period period = Period.valueOf(input.next().toUpperCase());
		 			addMagazine(cat,isbn2,title2,year2,pages2,period);
		 			break;
		 		case 3:
		 			System.out.println("Inserisci codice ISBN del libro/rivista da eliminare");
		 			Long codIsbn = input.nextLong();
		 			removeByISBN(codIsbn, cat);
		 			break;
		 		case 4:
		 			System.out.println("Inserisci codice ISBN del libro/rivista da cercare");
		 			long codIsbn2 = input.nextLong();
		 			findByISBN(codIsbn2, cat);
		 			break;
		 		case 5:
		 			System.out.println("Inserisci autore del libro da cercare");
		 			String findAuthor = input.nextLine();
		 			findByAuthor(findAuthor, cat);
		 			break;
		 		case 6:
		 			System.out.println("Inserisci l'anno di uscita del libro/rivista da cercare");
		 			int findYear = input.nextInt();
		 			findByYear(findYear, cat);
		 			break;
		 		case 7:
		 			readFile("/Users/anishfrigerio1999/git/JavaEpicode/Settimana2/ProgettoCatalogoBibliografico/catalogo.txt");
		 			break;
		 		default:
		 			System.out.println("Scelta non valida");
		 			
		 		}
		 	}while(scelta!=0);
		 	input.close();

//			addBook(cat,100L, "Harry Potter", 1997,300, "J.K. Rowling", "Fantascienza");
//			addBook(cat,101L, "Peter Pan", 1976, 350, "Peter", "Fantascienza");
//			addBook(cat,102L, "Signore degli Anelli", 1999, 400, "Tolkien", "Fantascienza");
//			addMagazine(cat,103L, "Focus", 2016, 40, Period.MENSILE);
//			addMagazine(cat,104L, "Playboy",2018, 50, Period.SETTIMANALE);
//			addMagazine(cat,105L, "Time",2023,47, Period.SEMESTRALE);
//			System.out.println(cat);
//			System.out.println("---------------------------------------------------------------------");
//			removeByISBN(105L, cat);
//			System.out.println(cat);
//			System.out.println("---------------------------Ricerca con ISBN--------------------------");
//			findByISBN(103L, cat);
//			System.out.println("---------------------------Ricerca con Autore------------------------");
//			findByAuthor("Peter", cat);
//			System.out.println("---------------------------Ricerca con Anno--------------------------");
//			findByYear(1987, cat);
//			System.out.println("---------------------------Leggi File Salvato-------------------------");
//			readFile("/Users/anishfrigerio1999/git/JavaEpicode/Settimana2/ProgettoCatalogoBibliografico/catalogo.txt");
//			
			
		   
	}
	public static List<Catalogue> addBook(List<Catalogue> lib,Long isbn, String title, int releaseYear, int numOfPages, String author, String genre ){
		lib.add(new Books(isbn, title, releaseYear, numOfPages, author, genre));
		saveToFile(lib, "/Users/anishfrigerio1999/git/JavaEpicode/Settimana2/ProgettoCatalogoBibliografico/catalogo.txt");
		return lib;
	}
	public static List<Catalogue> addMagazine(List<Catalogue> lib,Long isbn, String title, int releaseYear, int numOfPages, Enum<Period> period){
		lib.add(new Magazines(isbn, title, releaseYear, numOfPages, period));
		saveToFile(lib, "/Users/anishfrigerio1999/git/JavaEpicode/Settimana2/ProgettoCatalogoBibliografico/catalogo.txt");
		return lib;
	}
	private static int getIndexByISBN(long isbn, List<Catalogue> lib) {
        for (int i = 0; i <lib.size(); i++) {
            if (lib.get(i) !=null && lib.get(i).getISBN() == isbn) {
                return i;
            }
        }
        return -1;
    }
	public static void removeByISBN(Long isbn, List<Catalogue> lib) {
		if(getIndexByISBN(isbn, lib)!=-1) {
			lib.remove(getIndexByISBN(isbn, lib));
			saveToFile(lib, "/Users/anishfrigerio1999/git/JavaEpicode/Settimana2/ProgettoCatalogoBibliografico/catalogo.txt");
		}
	}
	public static void findByAuthor(String author, List<Catalogue> lib) {
			Stream<Catalogue> catalogueStream = 
					lib.stream().filter(
						(b) -> b.getClass() == Books.class
						).filter(b->((Books)b).getAuthor() == author);
				catalogueStream.forEach((b)->{
					System.out.println(b);
				});
			
		
	}
	public static void findByYear(int year, List<Catalogue> lib) {
		Stream<Catalogue> catalogueStream = 
				lib.stream().filter(
					(b) -> b.getReleaseYear() == year
					);
		if(catalogueStream.findAny().isPresent()) {
			catalogueStream.forEach((b)->{
				System.out.println(b);
			});
		}else {
			System.out.println("Nessun risultato");
		}
		
	
	}
	public static void findByISBN(Long isbn, List<Catalogue> lib) {
		Stream<Catalogue> catalogueStream = 
				lib.stream().filter(
					(b) -> b.getISBN() == isbn
					);
			catalogueStream.forEach((b)->{
				System.out.println(b);
			});
		
	
	}
	public static void saveToFile(List<Catalogue> lib,String path){
		 try{
			 // Su windows usare "C:\\Users\\MyName\\filename.txt"
		     FileWriter myWriter = new FileWriter(path);
		     myWriter.append(lib.toString());
		     myWriter.close();
		 }catch (IOException e) {
		     System.out.println("An error occurred.");
		     e.printStackTrace();
		 }
	}
	public static void readFile(String path) {
		try {
		      File myObj = new File(path);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}


