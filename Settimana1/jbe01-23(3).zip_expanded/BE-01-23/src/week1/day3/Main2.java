package week1.day3;

import java.time.LocalDate;

import week1.classes.Box;

public class Main2 {

	public static void main(String[] args) {
		
		Box b1 = new Box(10, 4);
		System.out.println( b1.getArea() );

		Box[] boxes = {
			new Box(3, 5), new Box(4, 1), new Box(2, 2), new Box(15, 3), b1
		};
		
		for(int i = 0; i < boxes.length; i++) {
			System.out.printf( "L'area della Box #%d è %.1f%n", i+1, boxes[i].getArea() );
			if( i == 4 ) {
				boxes[i].w = 100;
			}
		}
		
		System.out.println( b1.w );
		
		System.out.println( boxes[0].equals(boxes[1]) );
		System.out.println( boxes[1].equals(boxes[2]) );	
		
		LocalDate date = LocalDate.parse("1987-05-17");
		System.out.println( date.getYear() );
		 
	}

}
