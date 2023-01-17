
public class Giorno1_2 {

	public static void main(String[] args) {
		
		int[] x = new int[5];
		x[0] = 45;
		x[1] = 450;
		x[ x.length -1 ] = -300;
		System.out.println( java.util.Arrays.toString(x) );

		String[] words = {"back-end", "java", "programming", "database"};
		System.out.println( words[0] + " " + words[1] );
		
		String[][] colors = {
			{"blue", "red", "green"},					// 0
			{"black", "white"},							// 1
			{"gray", "lightgray", "darkgray"}			// 2
		};
		
		System.out.println( colors[2][1] );
		
		String[][] colors2 = new String[2][];
		colors2[0] = new String[] { "red", "blue", "green" };
		colors2[1] = new String[] { "black", "white" };
		
		System.out.println( java.util.Arrays.deepToString(colors2) );
		
		// ---------------------------------
		int v1 = 10;
		double v2 = v1;
		
		v1 = (int)v2;
		
		double v3 = 199.78645;
		v1 = (int)v3;
		
		System.out.println(v1);
		
		v1 = 500;
		byte v4 = (byte)v1;
		System.out.println( v4 );
		
		int v5 = 0b010101;
		int v6 = 01345;
		int v7 = 0x32a852;
		
		System.out.println( v7 );
		
		// --------------------
		double v8 = 100 % 50;
		System.out.println( v8 );
		
		int v9 = 10;
		System.out.println( v9++ );
		
		int a = 10, b = 4;
		/*
		 * a   b
		 * 10  4
		 * 11  3
		 */
		
		// 10 + 11 - 3 + 3*2
		System.out.println( a++ + a - --b + b*2 );
		
		/*
		int c = 10;
		System.out.println( ++c );			// c = c + 1  |  c += 1
		System.out.println( c );
		*/
		
		int c = 10;
		System.out.println( 10 < 4 && ++c == 12 );
		System.out.println( c );
		
		
	}

}
