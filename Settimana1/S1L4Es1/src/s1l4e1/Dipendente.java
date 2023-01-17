/**
 * 
 */
package s1l4e1;

/**
 * @author anishfrigerio1999
 *
 */
public class Dipendente {
//
	public double stipendioBase = 1000;
	
	private int matricola;
	private double stipendio;
	private double importoOrarioStraordinario;
	private Livello livello;
	private Dipartimento dipartimento;
// Contructors
	public Dipendente(int matricola, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = this.stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
	}
	
	public Dipendente(int matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
		this.matricola = matricola;
		this.dipartimento = dipartimento;
		this.stipendio = stipendio;
		this.importoOrarioStraordinario = 30;
		this.livello = Livello.OPERAIO;
	}
	public double getStipendioBase() {
		return stipendioBase;
	}
	
	public int getMatricola() {
		return matricola;
	}
	
	public double getStipendio() {
		return stipendio;
	}
	
	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}
	public Livello getLivello() {
		return livello;
	}
	
	public Dipartimento getDipartimento() {
		return dipartimento;
	}
	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}
	
	public void stampaDatiDipendenti() {
		System.out.println("Il dipendente "+ this.matricola + " ha uno stipendio che parte da " + this.stipendio);
		System.out.println("Lavora come "+this.livello+" nell'ambito di/della "+ this.dipartimento);
		System.out.println("I suoi straordinari verranno pagati "+this.importoOrarioStraordinario+" all'ora");
	}
	
	public Livello promuovi() {
		switch(this.livello) {
		case OPERAIO:
			this.livello = Livello.IMPIEGATO;
			this.stipendio *=1.2;
			break;
		case IMPIEGATO:
			this.livello = Livello.QUADRO;
			this.stipendio *= 1.5;
			break;
		case QUADRO:
			this.livello = Livello.DIRIGENTE;
			this.stipendio *= 2;
			break;
		default:
			System.out.println("Errore, non puoi salire di livello");
			break;
		}
		return this.livello;
	}
	public static double calcolaPaga(Dipendente dipendente) {
		return dipendente.stipendio;
	}
	public static double calcolaPaga(Dipendente dipendente, int ore) {
		return dipendente.stipendio+=(ore*dipendente.importoOrarioStraordinario);
	}

}
