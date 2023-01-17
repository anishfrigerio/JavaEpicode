package week1.classes;

public class While_DoWhile {

	public static void main(String[] args) {
		
		int x = 6, y = 3;
		while( y <= x + 6 ) {
			System.out.println( y );
			y += 3;
		}

		do {
			System.out.println( x++ );
		} while( x > 10 );
		
		System.out.println( "results:" );
		
		albero:
		for(int i = 1; i <= 5; i++) {
			if( i == 3 ) continue;
			
			for(int j = 1; j <= 5; j++) {
				if( j == 2 ) break albero;
				System.out.print( j + " " );
			}
			
			System.out.println( i );
		}
		
		
	}

}
