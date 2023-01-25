/**
 * 
 */
package progetto2; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.io.BufferedWriter;
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
		 	Scanner in = new Scanner(System.in);
		 	int scelta = 0;
		 	do {
		 		System.out.println("---------------------------MENU--------------------------");
		 		System.out.println(" 0.Chiudi Programma \n 1.Aggiungi Libro \n 2.Aggiungi Rivista \n 3.Rimuovi con ISBN \n 4.Cerca con ISBN \n 5.Cerca con Autore \n 6.Cerca con Anno di Uscita \n 7.Mostra dati salvati");
		 		scelta = in.nextInt();
		 		switch(scelta) {
		 		case 0:
		 			System.out.println("Programma chiuso");
		 			break;
		 		case 1:
		 			try {
		 				addBook(cat, in);
		 			}catch (java.util.InputMismatchException e) {
			        	System.out.println("Hai sbagliato a inserire, riprova");
			        	e.printStackTrace();
			        	in.nextLine();	
			        }
		 			break;
		 		case 2:
		 			addMagazine(cat, in);
		 			break;
		 		case 3:
		 			try {
		 				removeByISBN(cat, in);
		 			}catch (java.util.InputMismatchException e) {
			        	System.out.println("Hai sbagliato a inserire, riprova");
			        	e.printStackTrace();
			        	in.nextLine();	
			        }
		 			break;
		 		case 4:
		 			try {
		 				findByISBN(cat, in);
		 			}catch (java.util.InputMismatchException e) {
			        	System.out.println("Hai sbagliato a inserire, riprova");
			        	e.printStackTrace();
			        	in.nextLine();	
			        }
		 			break;
		 		case 5:
		 			try {
		 				findByAuthor(cat, in);
		 			}catch (java.util.InputMismatchException e) {
			        	System.out.println("Hai sbagliato a inserire, riprova");
			        	e.printStackTrace();
			        	in.nextLine();	
			        }
		 			break;
		 		case 6:
		 			try {
		 				findByYear(cat, in);
		 			}catch (java.util.InputMismatchException e) {
			        	System.out.println("Hai sbagliato a inserire, riprova");
			        	e.printStackTrace();
			        	in.nextLine();	
			        }
		 			break;
		 		case 7:
		 			readFile("/Users/anishfrigerio1999/git/JavaEpicode/Settimana2/ProgettoCatalogoBibliografico/catalogo.txt");
		 			break;
		 		default:
		 			System.out.println("Scelta non valida");
		 			
		 		}
		 	}while(scelta!=0);
		 	in.close();
		 	System.out.println(cat);

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
//			findByAuthor("J.K. Rowling", cat);
//			System.out.println("---------------------------Ricerca con Anno--------------------------");
//			findByYear(1987, cat);
//			System.out.println("---------------------------Leggi File Salvato-------------------------");
//			readFile("/Users/anishfrigerio1999/git/JavaEpicode/Settimana2/ProgettoCatalogoBibliografico/catalogo.txt");
//			
			
		   
	}
	public static List<Catalogue> addBook(List<Catalogue> lib, Scanner input){
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
		
		lib.add(new Books(isbn, title, year, pages, author, genre));
		saveToFile(lib, "/Users/anishfrigerio1999/git/JavaEpicode/Settimana2/ProgettoCatalogoBibliografico/catalogo.txt");
		return lib;
	}
	public static List<Catalogue> addMagazine(List<Catalogue> lib, Scanner input){
		System.out.println("Inserisci codice ISBN");
		long isbn = input.nextLong();
		input.nextLine();
		System.out.println("Inserisci titolo");
		String title = input.nextLine();
		System.out.println("Inserisci l'anno di pubblicazione");
		int year = input.nextInt();
		System.out.println("Inserisci il numero delle pagine");
		int pages = input.nextInt();
		System.out.println("Inserisci periodicità");
		Period period = Period.valueOf(input.next().toUpperCase());
		lib.add(new Magazines(isbn, title, year, pages, period));
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
	
	public static void removeByISBN(List<Catalogue> lib, Scanner input) {
		System.out.println("Inserisci codice ISBN del libro/rivista da eliminare");
		long isbn = input.nextLong();
		if(getIndexByISBN(isbn, lib)!=-1) {
			lib.remove(getIndexByISBN(isbn, lib));
			saveToFile(lib, "/Users/anishfrigerio1999/git/JavaEpicode/Settimana2/ProgettoCatalogoBibliografico/catalogo.txt");
		}
	}
	public static void findByAuthor(List<Catalogue> lib, Scanner input) {
			System.out.println("Inserisci autore del libro da cercare");
	        String author = input.next();
	        Stream<Catalogue> catalogueStream = lib.stream().filter((b) -> b.getClass() == Books.class)
	        		.filter(b->((Books)b).getAuthor() == author);
			catalogueStream.forEach((b)->{System.out.println(b);});	
	}
	
	public static void findByYear(List<Catalogue> lib, Scanner input) {
		System.out.println("Inserisci l'anno del libro da cercare");
		input.nextLine();
	    int year = input.nextInt();
	    Stream<Catalogue> catalogueStream = lib.stream().filter((b) -> b.getReleaseYear() == year);
	    catalogueStream.forEach((b)->{System.out.println(b);});
	}
	
	public static void findByISBN(List<Catalogue> lib, Scanner input){
		System.out.println("Inserisci codice ISBN del libro/rivista da cercare");
	    long isbn = input.nextLong();
	    Stream<Catalogue> catalogueStream = 
	    lib.stream().filter((b) -> b.getISBN() == isbn);
	    catalogueStream.forEach((b)->{System.out.println(b);});
	}
	
	public static void saveToFile(List<Catalogue> lib,String path){
		 try{
		    	File file =new File(path);
		    	/* Questa logica è per creare il file se il
		    	 * file non è gia presente
		    	 */
		    	if(!file.exists()){
		    	   file.createNewFile();
		    	}
		    	//Qua true è per appendere il contenuto al file
		    	FileWriter fw = new FileWriter(file,true);
		    	BufferedWriter bw = new BufferedWriter(fw);
		    	bw.write(lib.toString());
		    	//Chiude BufferedWriter Stream
		    	bw.close();


		      }catch(IOException e){
		         System.out.println("Exception occurred:");
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


