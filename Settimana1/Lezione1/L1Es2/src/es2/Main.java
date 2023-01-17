/**
 * 
 */
package es2;

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
		//MOLTIPLICAZIONE//
		System.out.println("Inserire due numeri");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		System.out.println("Risultato moltiplicazione : " + moltiplicazione(n1,n2));
        
		
		// CONCATENAZIONE
		System.out.println("Inserire una stringa");
		String nome = input.next();
		System.out.println("Inserire un numero");
		int numero = input.nextInt();
		System.out.println("Nome e numero del giocatore : " + concatena(nome, numero));
		
		//AGGIUNTA ARRAY
		String[] arrStr=new String[5];        
	    System.out.println("Inserisci 5 stringhe : ");
	    for(int i =0;i<arrStr.length;i++){
	    arrStr[i] = input.next();
	    }
		System.out.println("Inserisci stringa da aggiungere in mezzo");
		String str = input.next();
				
		System.out.println(java.util.Arrays.toString(arrStr));
		System.out.println(java.util.Arrays.toString(inserisciInArray(arrStr,str)));
		input.close();
		
	}
	public static int moltiplicazione (int num1 , int num2) {
		return (num1 * num2);
	}
	
	public static String concatena (String stringa , int numero) {
         String concatena  = stringa + numero;
         return concatena;
	}
	
	public static String[] inserisciInArray(String[] arr, String str ) {
		String[] risultato = new String[6];
		risultato[0] = arr[0];
		risultato[1] = arr[1];
		risultato[2] = str;
		risultato[3] = arr[2];
		risultato[4] = arr[3];
		risultato[5] = arr[4];
				
		return risultato;
		
	}

}
