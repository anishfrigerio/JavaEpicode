package entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Entity implementation class for Entity: Catalogo
 *
 */
@Entity
@Table(name="Catalogo")
@Getter
@Setter
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="element_type", discriminatorType= DiscriminatorType.STRING)
public class Catalogo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private long isbn;
	private String title;
	private int releaseYear;
	private int numOfPages;
	
	
	
	@OneToOne(mappedBy="elemento")
	private Prestito prestito;
	
	public Catalogo(long isbn, String title, int releaseYear, int numOfPages) {
		// TODO Auto-generated constructor stub
		this.isbn = isbn;
		this.title = title;
		this.releaseYear = releaseYear;
		this.numOfPages = numOfPages;
	}
   
}
