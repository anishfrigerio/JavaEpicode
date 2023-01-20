/**
 * 
 */
package progetto2;

/**
 * @author anishfrigerio1999
 *
 */
public class Catalogue {
	private Long isbn;
	private String title;
	private int releaseYear;
	private int numOfPages;
	
	public Catalogue(Long isbn, String title, int releaseYear, int numOfPages) {
		// TODO Auto-generated constructor stub
		this.isbn = isbn;
		this.title = title;
		this.releaseYear = releaseYear;
		this.numOfPages = numOfPages;
	}
	
	public Long getISBN() {
		return isbn;
	}

	public void setISBN(Long isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}
	
	

}
