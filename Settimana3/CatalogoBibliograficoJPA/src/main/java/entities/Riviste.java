import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor


public class Riviste extends Catalogo {

   public Riviste(long isbn, String title, int releaseYear, int numOfPages, Enum<Period> period ) {
        super(isbn, title, releaseYear, numOfPages);
        this.period = period;

    }
   @Enumerated(EnumType.STRING)
    private Enum<Period> period;


    @Override
    public String toString() {
        String stringa = "Titolo: "+ this.getTitolo() + " Anno di pubblicazione: " + this.getAnnoPub() + " Numero di pagine: " + this.getNumPag() + " Periodicità: "+this.getPeriod()+ " Codice ISBN: " + this.getIsbn() ;
        return  stringa;
    }

}
