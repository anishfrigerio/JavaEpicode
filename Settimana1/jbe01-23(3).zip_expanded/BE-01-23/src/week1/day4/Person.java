package week1.day4;

import java.time.LocalDate;

public class Person {
	private String name;
	private String lastname;
	private LocalDate birthday;
	private int age;
	private WorkType workType;
	
	public Person(WorkType wk) {
		this.workType = wk;
	}
	
	public Person(String name, int age) {
		setName(name);
		setAge(age);
	}
	
	public Person(String name, String lastname, int age ) {
		this(name, age);
		setLastname(lastname);
	}
	
	public Person(String name, String lastname, int age, LocalDate b ) {
		this(name, lastname, age);
		setBirthday(b);
	}
	
	// setter
	public void setName(String n) {
		if( n.length() <= 1 ) {
			PersonError.printError("name");
			return;
		}
		
		this.name = n;
	}
	
	public void setLastname(String ln) {
		if( ln.length() <= 1 ) {
			PersonError.printError("name");
			return;
		}
		
		this.lastname = ln;
	}
	
	public void setAge(int a) {
		if( a < 0 || a > 120 ) {
			PersonError.printError("age");
			return;
		}
		
		this.age = a;
	}
	
	public void setBirthday(LocalDate b) { this.birthday = b; }
	
	// getters
	public String getName() { return this.name; }
	public int getAge() { return this.age; }
	
	// metodi
	public static void updatePerson(Person p, String n, int a) {
		p.setName(n);
		p.setAge(a);
	}
	
	public static Person youngerPerson(Person p1, Person p2) {
		return p1.getAge() < p2.getAge() ? p1 : p2;
	}
	
	@Override
	public String toString() {
		return String.format("Ciao, sono una persona e mi chiamo %s e ho %d anni.%n", this.name, this.age );
	}
	
	public void sayHello() {
		System.out.println( "ciao, sono una persona!" );
	}
	
	public void sayHello(boolean type) {
		if( type )
			this.sayHello();
		else
			System.out.println( "ciao, sono una persona e mi chiamo " + this.getName() );
	}
	
	public void sayHello(String country) {
		this.sayHello(true);
		System.out.println("Vivo in " + country);
	}
	
	public void sayHello(byte x) {
		System.out.println( "byte version of x" );
	}
	
	public void sayHello(int x) {
		System.out.println( "int version of x" );
	}
	
	public void getInfo() {
		switch( this.workType ) {
			case DIPENDENTE:
				System.out.println( "sono un dipendente!" );
				break;
				
			case CAPO:
				System.out.println( "sono il capo!" );
				break;
				
			case FREELANCE:
				System.out.println( "sono un freelance!" );
				break;
		}
	}
}
