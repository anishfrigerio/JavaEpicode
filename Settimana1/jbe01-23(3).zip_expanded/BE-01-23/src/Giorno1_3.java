import java.util.Scanner;

public class Giorno1_3 {

	// MAIN
	public static void main(String[] args) {
		
		System.out.println( sum(10, 20) );
		int x = sum(10, -10);
		System.out.println( x );
		
		printSum(10, -4, 10);
		helloStudent("Mario");
		helloStudent("Luigi");
		
		int[] numbers = {10, 20, 30, 40};
		/*
		int i = 0;
		while( i < numbers.length ) {
			System.out.println( numbers[i] );
			i++;
		}
		*/
		for(int i = 0; i < numbers.length;)
			System.out.println( numbers[i++] );
		
		// apertura scanner
		Scanner in = new Scanner(System.in);
		System.out.println( "inserisci nome:" );
		String studentName = in.nextLine();
		
		System.out.println( "dammi x:" );
		x = Integer.parseInt( in.nextLine() );
		
		System.out.println( "dammi y:" );
		int y = Integer.parseInt( in.nextLine() );
		
		System.out.println( "hai inserito il valore: " + studentName );
		System.out.println( "la somma dei dati inseriti è: " + (x+y) );
		
		// chiusura scanner
		in.close();
	}
	// END MAIN
	
	// static tipoDiRitorno nomeMetodo(listaParametri)
	static int sum(int a, int b) {
		return a + b;
	}
	
	static void printSum(int a, int b, int c) {
		System.out.println( a + b + c );
	}
	
	static void helloStudent(String studentName) {
		System.out.println( "Hello, " + studentName + " welcome to the Java course!" );
	}

}
