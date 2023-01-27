package entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("Libro")
@Getter
@Setter
@NoArgsConstructor
public class Libri extends Catalogo {
	private String autore;
	private String genere;
	
	public Libri() {
		// TODO Auto-generated constructor stub
		super(isbn, title, releaseYear, numOfPages);
		this.autore = autore;
		this.genere = genere;
	}
	
	@Override
	public String toString() {
		return "Titolo: "+this.getTitle()+". Autore: "+this.getAuthor()+". Genere: "+this.getGenre()+". Anno di pubblicazione: "+this.getReleaseYear()+". Numero di pagine: "+this.getNumOfPages()+". Codice ISBN: "+this.getISBN()+"\n";
	}

}
