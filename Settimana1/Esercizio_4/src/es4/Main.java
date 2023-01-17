/**
 * 
 */
package es4;

import java.util.Scanner;

/**
 * @author anishfrigerio1999
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Inserire la base del rettangolo");
		double baseRect = input.nextDouble();
		System.out.println("Inserire l'altezza del rettangolo");
		double altezzaRect = input.nextDouble();
		System.out.println("Il perimetro del rettangolo è : "+calcPerimetroRect(baseRect, altezzaRect));
		System.out.println("L'area del rettangolo è : "+calcAreaRect(baseRect, altezzaRect));
		System.out.println("Inserire primo lato del triangolo");
		double primoLato = input.nextDouble();
		System.out.println("Inserire secondo lato del triangolo");
		double secondoLato = input.nextDouble();
		System.out.println("Inserire terzo lato del triangolo");
		double terzoLato = input.nextDouble();
		System.out.println("Il perimetro del triangolo è : "+ calcPerimetroTri(primoLato, secondoLato, terzoLato));
		System.out.println("L'area del triangolo è : "+ calcAreaTri(primoLato, secondoLato, terzoLato));
		System.out.println("Inserire un numero intero per vedere se è pari o dispari");
		int num = input.nextInt();
		System.out.println(pariDispari(num));
		input.close();
		
	}
	public static double calcPerimetroRect(double b, double h) {
		return (b+h)*2;
	}
	public static double calcAreaRect(double b, double h) {
		return b*h;
	}
	public static double calcPerimetroTri(double lato1, double lato2, double lato3) {
		return lato1+lato2+lato3;
	}
	public static double calcAreaTri(double lato1, double lato2, double lato3) {
		double semiP = (lato1+lato2+lato3)/2;
		double radicando = semiP*(semiP-lato1)*(semiP-lato2)*(semiP-lato3);
		return Math.sqrt(radicando);
	}
	public static String pariDispari(int n) {
		if(n%2==0) {
			return "Il numero è pari";
		}else {
			return "Il numero è dispari";
		}
	}
	

}
