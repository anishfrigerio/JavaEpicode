package week1.day4.animals;

abstract public class Animal {
	protected String name;
	protected int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Ciao, sono un Animal";
	}
	
	public void roar() {
		System.out.println("generic roar");
	}
	
	abstract public void getInfo();
	
}
