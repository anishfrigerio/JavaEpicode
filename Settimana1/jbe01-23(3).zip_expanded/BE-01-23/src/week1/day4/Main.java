package week1.day4;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("mario", 34);
		p1.setAge(-200);
		
		System.out.println( "l'età di " + p1.getName() + " è " + p1.getAge() );
		
		Person p2 = new Person("anna", 34);
		
		Person.updatePerson(p2, "luigi", 10);
		
		System.out.println( p2 );
		
		System.out.println( Person.youngerPerson(p1, p2).getName() );
		
		Student s1 = new Student();
		
		// package / default
		System.out.println( s1.x );
		
		// public
		System.out.println( s1.y );
		
		// protected
		System.out.println( s1.z );
		
		// private
		//System.out.println( s1.w );
		
		p1.sayHello();
		p1.sayHello(true);
		p1.sayHello(false);
		p1.sayHello("California");
		
		p1.sayHello( (byte)100 );
		
		Person p3 = new Person( WorkType.FREELANCE );
		p3.getInfo();

		
	}

}
