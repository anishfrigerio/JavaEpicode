/**
 * 
 */
package s2l2es2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
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
		System.out.println("Inserisci dimensione lista");
		int n = input.nextInt();
		System.out.println(generaLista(n));
		input.close();
	}
	public static ArrayList<Integer> generaLista(int n){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			int rand = (int)(Math.random()*100);
			numbers.add(rand);
		}
		Collections.sort(numbers);
		return numbers;
	}

}
