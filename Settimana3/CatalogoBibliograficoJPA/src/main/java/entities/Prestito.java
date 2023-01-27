package entities;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "prestiti")
@Getter
@Setter
@NoArgsConstructor

public class Prestito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "utente_id", referencedColumnName = "id")
	private Utente utente;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "elemento_prestato", referencedColumnName = "id")
	private Catalogo elemento;
	
	@Column(name = "data_prestito")
	private LocalDate dataPrestito;
	
	@Column(name = "restituzione_prevista")
	private LocalDate restituzionePrevista;
	
	@Column(name = "restituzione_effettiva")
	private LocalDate restituzioneEffettiva;

	public Prestito(Utente utente, Catalogo elemento, LocalDate dataPrestito, LocalDate restituzioneEffettiva) {
		// TODO Auto-generated constructor stub
		this.utente = utente;
		this.elemento = elemento;
		this.dataPrestito = dataPrestito;
		this.restituzionePrevista = dataPrestito.plusMonths(1);
		this.restituzioneEffettiva = restituzioneEffettiva;
	}

}
