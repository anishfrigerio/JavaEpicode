
public class Giorno1 {

	public static void main(String[] args) {
		
		// tipoVariabile nomeVariabile = valore
		int x = 10;
		System.out.println( x );
		
		// tipi di dato numerici interi
		byte v1 = 100;
		short v2 = 15_000;
		long v3 = 1000000000000L;
		
		// caratteri
		char v4 = 'a';
		char v5 = 82;
		System.out.println( v5 );
		
		// numeri a virgola mobile
		float v6 = 10.69f;
		double v7 = 10.5678912d;

		boolean v8 = true;
		boolean v9 = false;
		
		int _______x = 10;
		int $___$ = 20;
		//int 10abc;
		
		int sumToPrint = 10;
		sumToPrint = 20;
		
		final int RESULT = sumToPrint + 20;
		// result = 10;
		System.out.println( sumToPrint * 2 + RESULT );
		
		String firstName = "Mario";
		String lastName = "Rossi";
		
		System.out.println( firstName + " " + lastName );
		System.out.println( "La lunghezza del nome " + firstName + " �: " + firstName.length() );
		System.out.println( firstName.charAt(0) );
		System.out.println( "questo � un corso python".replace("python", "java") );
		
	}

}
