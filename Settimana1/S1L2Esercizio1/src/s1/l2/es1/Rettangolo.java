package s1.l2.es1;

public class Rettangolo {
	private double altezza;
	private double larghezza;
	public Rettangolo(double alt, double lar) {
		// TODO Auto-generated constructor stub
		this.altezza = alt;
		this.larghezza = lar;
	}
	public double calcPerimetro() {
		double result = (this.altezza+this.larghezza)*2;
		return result;
	}
	public double calcArea() {
		double result = (this.altezza*this.larghezza);
		return result;
	}
	public static void stampaRettangolo(Rettangolo rettangolo) {
		System.out.println("Area del rettangolo è " + rettangolo.calcArea());
		System.out.println("Perimetro del rettangolo è " + rettangolo.calcPerimetro());
	}
	public static void stampaDueRettangoli(Rettangolo rect1, Rettangolo rect2) {
		System.out.println("L'area totale : "+(rect1.calcArea()+rect2.calcArea()));
		System.out.println("Il perimetro totale : "+(rect1.calcPerimetro()+rect2.calcPerimetro()));
	}
	
}
