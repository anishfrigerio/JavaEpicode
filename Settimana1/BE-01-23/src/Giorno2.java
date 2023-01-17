
public class Giorno2 {
	public static void main(String[] args) {
		// creare le istnzzdi Human
		Human h1 = new Human();
		h1.firstName = "Mario";
		h1.lastName = "Rossi";
		System.out.println( h1.firstName + " " + h1.lastName );
		h1.sayHello();
		
		for(int i = 1; i <= 10; i++) {
			//System.out.println( "ciao " + h1.firstName + " x" + i );
			// %s = string
			// %d = intero
			// %f float double
			// %b booleani
			// %n rimando a capo
			//String message = String.format("ciao %s x%d", h1.firstName, i);
			System.out.println(String.format("ciao %s x%d", h1.firstName, i));
			
			{
				int x = 10;
			}
			//System.out.println(x);
			
			//System.out.printf("ciao %s x%d %n", h1.firstName, i);
		}
		
		Human h2 = new Human("Luigi", "Verdi");
		h2.sayHello();

	}
}


// classi
class Human {
	// proprietà
	String firstName, lastName;
	
	// costruttori
	public Human() {
		
	}
	
	public Human(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}
	
	// metodi
	void sayHello() {
		//System.out.println( "ciao sono un umano! Mi chiamo " + this.firstName + " " + this.lastName );
		String firstName = "Laura";
		System.out.printf( "ciao sono un umano! Mi chiamo %s %s%n", this.firstName, lastName );
	}
}