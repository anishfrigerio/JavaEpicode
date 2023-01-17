package week1.day4.animals;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
	}
	
	public void jump(double q) {
		System.out.println( "cat is jumping " + q + " cm" );
	}
	
	public void roar(boolean high) {
		super.roar();
		if( high ) super.roar();
	}
	
	@Override
	public void roar() {
		System.out.println("miao miao");
	}
	
	@Override
	public void getInfo() {
		System.out.println("Sono un Cat");
	}
	
}
