package s1l4e1;

public class GestioneDip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dipendente d1 = new Dipendente(111, Dipartimento.PRODUZIONE);
		Dipendente d2 = new Dipendente(222, Dipartimento.PRODUZIONE);
		Dipendente d3 = new Dipendente(333, 1300, 20, Livello.IMPIEGATO, Dipartimento.PRODUZIONE);
		Dipendente d4 = new Dipendente(444, 2000, 30, Livello.DIRIGENTE, Dipartimento.PRODUZIONE);
		d2.promuovi();
		d3.promuovi();
		
		System.out.println(d2.getStipendio());
		System.out.println(d3.getStipendio());
		System.out.println(Dipendente.calcolaPaga(d4,50));
	}

}
