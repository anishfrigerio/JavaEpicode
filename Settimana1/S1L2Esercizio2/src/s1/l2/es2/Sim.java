package s1.l2.es2;

public class Sim {
	int numeroCell;
	double credito;
	int[] chiamate;

	public Sim(int numTel, double credit, int[] calls) {
		// TODO Auto-generated constructor stub
		this.numeroCell = numTel;
		this.credito = credit;
		this.chiamate = calls;
	}
	public static void stampaSim(Sim simGenerico) {
		System.out.println("Numero: "+simGenerico.numeroCell+"Credito: "+simGenerico.credito+"Chiamate e la durata: "+simGenerico.chiamate);
		
	}
}
