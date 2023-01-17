package week1.day4;

public class PersonError {

	private static String nameError = "Il nome deve avere almeno 2 caratteri";
	private static String ageError = "L'et� deve essere compresa tra 1 e 120";
	private static String genericError = "Errore";
	
	public static void printError(String type) {
		switch( type ) {
			case "name":
				System.out.println( nameError );
				break;
				
			case "age":
				System.out.println( ageError );
				break;
				
			default:
				System.out.println( genericError );
		}
	}
	
}
