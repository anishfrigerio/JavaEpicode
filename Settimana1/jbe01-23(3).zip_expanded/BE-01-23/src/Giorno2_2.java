
public class Giorno2_2 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Mario", "Rossi", new int[] {7, 8, 4, 5});
		System.out.println( s1.getAvg() );
		
		Student s2 = s1;
		
		s2.firstName = "Luigi";
		System.out.println( s1.firstName );
		
		s2 = new Student("Laura", "Bianchi", new int[] {7, 8, 4, 5});
		s2 = null;
		
		int x = 10;
		int y = x;
		x = 20;
		System.out.println( y );
		
		System.out.println( "Nome scuola: " + Student.school );
		System.out.println( "Nome scuola: " + s1.school );
		s1.school = "CodeEpic";
		System.out.println( "Nome scuola: " + Student.school );
		System.out.println( "Nome scuola: " + s2.school );
		
		// test
		Student s4 = new Student("peach", "pink", new int[] {2,2,4});
		Student s5 = new Student("daisy", "green", new int[] {5,8,7});
		Student s6 = s4, s7 = s5;
		s5 = null;
		System.out.println( s6.votes[1] + s7.votes[0] );
		
		
	}

}
