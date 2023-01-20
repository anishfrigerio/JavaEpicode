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
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	List<Catalogue> cat = new ArrayList<Catalogue>();

			addBook(cat,100L, "Harry Potter", 1997,300, "J.K. Rowling", "Fantascienza");
			addBook(cat,101L, "Peter Pan", 1976, 350, "Peter", "Fantascienza");
			addBook(cat,102L, "Signore degli Anelli", 1999, 400, "Tolkien", "Fantascienza");
			addMagazine(cat,103L, "Focus", 2016, 40, Period.MENSILE);
			addMagazine(cat,104L, "Playboy",2018, 50, Period.SETTIMANALE);
			addMagazine(cat,105L, "Time",2023,47, Period.SEMESTRALE);
			System.out.println(cat);
			System.out.println("---------------------------------------------------------------------");
			removeByISBN(105L, cat);
			System.out.println(cat);
			System.out.println("---------------------------Ricerca con ISBN--------------------------");
			findByISBN(103L, cat);
			System.out.println("---------------------------Ricerca con Autore------------------------");
			findByAuthor("Peter", cat);
			System.out.println("---------------------------Ricerca con Anno--------------------------");
			findByYear(1997, cat);
			System.out.println("---------------------------Leggi File Salvato-------------------------");
			readFile("/Users/anishfrigerio1999/git/JavaEpicode/Settimana2/ProgettoCatalogoBibliografico/catalogo.txt");
			
			
		   
	}
	public static List<Catalogue> addBook(List<Catalogue> lib,Long isbn, String title, int releaseYear, int numOfPages, String author, String genre ){
		lib.add(new Books(isbn, title, releaseYear, numOfPages, author, genre));
		saveToFile(lib);
		return lib;
	}
	public static List<Catalogue> addMagazine(List<Catalogue> lib,Long isbn, String title, int releaseYear, int numOfPages, Enum<Period> period){
		lib.add(new Magazines(isbn, title, releaseYear, numOfPages, period));
		saveToFile(lib);
		return lib;
	}
	private static int getIndexByISBN(Long isbn, List<Catalogue> lib) {
        for (int i = 0; i <lib.size(); i++) {
            if (lib.get(i) !=null && lib.get(i).getISBN().equals(isbn)) {
                return i;
            }
        }
        return -1;
    }
	public static void removeByISBN(Long isbn, List<Catalogue> lib) {
		if(getIndexByISBN(isbn, lib)!=-1) {
			lib.remove(getIndexByISBN(isbn, lib));
			saveToFile(lib);
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
		catalogueStream.forEach((b)->{
			System.out.println(b);
		});
	
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
	public static void saveToFile(List<Catalogue> lib) {
		 try{
			 // Su windows usare "C:\\Users\\MyName\\filename.txt"
		     FileWriter myWriter = new FileWriter("/Users/anishfrigerio1999/git/JavaEpicode/Settimana2/ProgettoCatalogoBibliografico/catalogo.txt");
		     myWriter.write(lib.toString());
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


