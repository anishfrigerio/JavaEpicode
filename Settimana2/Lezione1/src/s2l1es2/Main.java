/**
 * 
 */
package s2l1es2;

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
		System.out.println("Inserisci i litri di carburante usati: ");
		int km = input.nextInt();
		System.out.println("Inserisci i litri di carburante utilizzati: ");
		
		try {
			int litri = input.nextInt();
			int risultato = km/litri;
			System.out.println("i km/litro percorsi sono: "+ risultato);
		}catch(ArithmeticException e){
			System.out.println("Non fare il furbo!");
		}finally {
			input.close();
		}
	}

}
