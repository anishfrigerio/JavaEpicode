/**
 * 
 */
package es3;

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
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Inserisci la prima stringa");
        String str1 = myObj.next();
        System.out.println("Inserisci la seconda stringa");
        String str2 = myObj.next();
        System.out.println("Inserisci la terza stringa");
        String str3 = myObj.next();
        System.out.printf("La stringa concatenata in ordine è : %s-%s-%s %n",str1,str2,str3);
        System.out.printf("La stringa concatenata inversa è : %s-%s-%s %n", str3,str2,str1);
        myObj.close();

	}

}
