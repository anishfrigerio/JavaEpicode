/**
 * 
 */
package progetto2;

/**
 * @author anishfrigerio1999
 *
 */
public class Magazines extends Catalogue {

	private Enum<Period> period;

	public Magazines(long isbn, String title, int releaseYear, int numOfPages, Enum<Period> period) {
		super(isbn, title, releaseYear, numOfPages);
		this.period = period;
	}

	public Enum<Period> getPeriod() {
		return period;
	}

	public void setPeriod(Enum<Period> period) {
		this.period = period;
	}

	
	@Override
	public String toString() {
		return "Titolo: "+this.getTitle()+". Periodicità: "+this.getPeriod()+". Anno di pubblicazione: "+this.getReleaseYear()+". Numero di pagine: "+this.getNumOfPages()+". Codice ISBN: "+this.getISBN()+"\n";
	}
	

}
