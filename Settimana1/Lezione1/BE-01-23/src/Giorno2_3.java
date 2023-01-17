
public class Giorno2_3 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		System.out.println( x == y );
		
		double z = 10.0;
		System.out.println( x == z );
		
		Student s1 = new Student("Mario", "Rossi", new int[] {7, 8, 4, 5});
		Student s2 = new Student("Maria", "Rossi", new int[] {7, 8, 8, 5});

		System.out.println( s1 == s2 );
		
		System.out.println( 
			"gli studenti sono uguali? (hanno la stessa media voto)" + s1.equals(s2) 
		);
		
		String str1 = "ciao";
		String str2 = new String("ciao");
		String str3 = str2;
		
		// confronto di stringhe per reference
		System.out.println( str1 == str2 );
		System.out.println( str2 == str3 );
		
		// confronto per logica custom
		System.out.println( str1.equals(str2) );
		
		Box b1 = new Box(30, 10);
		Box b2 = new Box(30, 10);
		
		System.out.println( b1 == b2 );
		System.out.println( b1.equals(b2) );
		System.out.println( b1.compareBoxes(b2) );
		
		String str4 = "10";
		//System.out.println( str4 == x );
		System.out.println( "result: " + str4.equals(x) );
		
	}

}

class Box {
	int x, y;
	Box(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean compareBoxes(Box b) {	
		return (this.x*this.y) == (b.x*b.y);
	}
	
}
