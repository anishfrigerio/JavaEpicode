/**
 * 
 */
package progetto2;

/**
 * @author anishfrigerio1999
 *
 */
public class Books extends Catalogue {
	private String author;
	private String genre;
	public Books(long isbn, String title, int releaseYear, int numOfPages, String author, String genre) {
		super(isbn, title, releaseYear, numOfPages);
		// TODO Auto-generated constructor stub
		this.author = author;
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	@Override
	public String toString() {
		return "Titolo: "+this.getTitle()+". Autore: "+this.getAuthor()+". Genere: "+this.getGenre()+". Anno di pubblicazione: "+this.getReleaseYear()+". Numero di pagine: "+this.getNumOfPages()+". Codice ISBN: "+this.getISBN()+"\n";
	}
	
	

	

}
