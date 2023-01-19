/**
 * 
 */
package s2l3es2;

import java.util.ArrayList;

/**
 * @author anishfrigerio1999
 *
 */
public class Main {
	static ArrayList<Integer> numbers = new ArrayList<Integer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	public static ArrayList<Integer> generaDividiLista(){
		for(int i=0;i<3000;i++) {
			int rand = (int)(Math.random()*100);
			numbers.add(rand);
		}
		ArrayList<Integer> arr1 = numbers.subList(0, 999);
	}
   
}
