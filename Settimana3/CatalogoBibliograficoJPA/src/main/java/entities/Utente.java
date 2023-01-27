package entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "utenti")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Utente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String surname;
	
	private LocalDate dateOfBirth;
	
	@Column(name = "numero_tessera")
	private long nTessera;
	
	@OneToMany(mappedBy = "utente")
	private List<Prestito> prestiti;

	public Utente(String name, String surname, LocalDate dateOfBirth, long nTessera) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.nTessera = nTessera;
	}
	

}
