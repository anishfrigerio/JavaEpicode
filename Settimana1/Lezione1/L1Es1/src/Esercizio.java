import java.util.Scanner;

public class Esercizio {

	public static void main(String[] args) {
		//Esercizio 1
		Scanner myObj = new Scanner(System.in);	
		System.out.println("Inserisci due interi:");
		int num1 = myObj.nextInt();
		int num2 = myObj.nextInt();
		System.out.println("Il risultato della moltiplicazione è :"+(num1*num2));
		//Esercizio 2
		System.out.println("Inserisci una stringa");
		String str = myObj.next();
		System.out.println("Inserisci un intero");
		int num3 = myObj.nextInt();
		System.out.println("La stringa concatenata è:" + str+num3);
		//Esercizio 3
		String[] arr=new String[5];        
	    System.out.println("Enter five strings : ");
	    for(int i =0;i<arr.length;i++){
	    arr[i] = myObj.next();
	    }
	    System.out.println(java.util.Arrays.toString(arr));
	    System.out.println("Inserisci un altro nome");
	    myObj.close();
	   
	    
	    
	}
}