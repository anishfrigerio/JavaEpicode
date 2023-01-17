package week1.classes;

public class Switch2 {

	public static void main(String[] args) {
		
		int x = 10, y = x++, z = y - 2;
		switch(z) {
			default:
				System.out.println("red");
			break;
			
			case 6:
				System.out.println("blue");
			case 7:
				System.out.println("green");
			case 8:
				System.out.println("pink");
			case 9:
				System.out.println("white");
				break;
			case 10:
				System.out.println("black");
		}

	}

}
