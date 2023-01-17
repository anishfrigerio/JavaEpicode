package week1.day4.animals;

public class Dog extends Animal implements Jumpable {
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void run() {
		System.out.println( "dog is running" );
		System.out.println( this.name );
	}
	
	@Override
	public void roar() {
		super.roar();
		System.out.println( "bau bau" );
	}
	
	@Override
	public void getInfo() {
		System.out.println("Sono un Dog");
	}

	@Override
	public void jumpVertically(int cm) {
		System.out.println("jump v" + cm);
	}

	@Override
	public void jumpHorizontally(int cm) {
		System.out.println("jump h" + cm);
	}
	
}

//class MyString extends String {}
