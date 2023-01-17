package week1.day3;

import week1.classes.Box;

public class Main1 {

	public static void main(String[] args) {
		
		int x = 10, y = 30;
		if( x > y ) {
			System.out.println("red");
		}
		else if( x == 20 ) {
			System.out.println("green");
		}
		else if( x < 30 ) {
			System.out.println("white");
		}
		else {
			System.out.println("blue");
		}
		
		if( y % 2 == 0 ) {
			y = 40;
			/*
			if( x <= y-10 ) {
				System.out.println("red");
			}
			else {
				System.out.println( "blue" );
			}
			*/
			
			System.out.println( ( x <= y-10 ) ? "red" : "blue" );
		}
		
		// condition ? v if true : v if false
		
		
		
		String favColor = "green";
		switch(favColor) {
			case "red":
				System.out.println("hot color");
				break;
			case "blue":
				System.out.println("cold color");
				break;
			default:
				System.out.println("unknown color");
		}
		
		x = 10; 
		y = 20; 
		int z = ( x > y ) ? -100 : 100;
		System.out.println( getValue(4, 3, 5) );
		switch(z) {
			case 30:
				x++;
			break;
			
			case -100:
				System.out.println("red");
			case 100:
				System.out.println("blue");
				--x;
			default:
				System.out.println("green");
		}
		
		System.out.println(x);

	}
	
	static int getValue(int a, int b, int c) {
		return ( a > b ) ? ((a > c) ? a : c) : ((b > c) ? b : c);
	}

}
