/**
 * 
 */
package s2l2es1;
import java.util.ArrayList;
import java.util.HashSet;
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
		System.out.println("Inserisci numero di elementi da inserire");
		int n = input.nextInt();
		System.out.printf("Inserisci %d parole %n",n);
		HashSet<String> mioSet=new HashSet<>();
		ArrayList<String> duplicati = new ArrayList<>();
		for(int i = 1; i<n+1;i++) {
			System.out.printf("Inserisci parola %d %n",i);
			String parola = input.next();
			if(mioSet.contains(parola)) {
				duplicati.add(parola);
			}
			mioSet.add(parola);
		}
		if (!duplicati.isEmpty()) {
			System.out.println("Parole duplicati: "+duplicati);
		}
		System.out.println("Numero di parole distinte: "+mioSet.size());
		System.out.println("Parole distinte: "+mioSet);
		input.close();
	}

}
