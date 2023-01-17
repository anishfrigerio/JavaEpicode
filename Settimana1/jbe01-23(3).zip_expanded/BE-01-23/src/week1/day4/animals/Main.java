package week1.day4.animals;

public class Main {

	public static void main(String[] args) {
		
		Dog d1 = new Dog("fuffy", 10);
		System.out.println( d1.getName() );
		System.out.println( d1 );
		d1.roar();
		
		Cat c1 = new Cat("milo", 4);
		System.out.println( c1.getName() );
		System.out.println( c1 );
		c1.jump(10);
		c1.roar(true);
		c1.roar();
		
		Animal a1 = new Dog("sirio", 3);
		a1.roar();
		
		a1 = getAnimal("cat");
		
		getAnimalInfo( a1 );
		getAnimalInfo( d1 );
		getAnimalInfo( c1 );
		
		Animal hya = new Husky("hya", 3);
		Dog _hya = new Husky("hya", 3);
		Husky __hya = new Husky("hya", 3);
		
		Animal[] animals = { d1, c1, new Cat("kay", 3), new Husky("hya", 3) };
		
		// enhanced for loop
		for(Animal a : animals) {
			getAnimalInfo( a );
		}
		
	}
	
	public static void getAnimalInfo(Animal a) {
		System.out.println("---Print Animal Info---");
		a.getInfo();
		
		if( a instanceof Dog )
			((Dog)a).run();
	}
	
	public static Animal getAnimal(String type) {
		switch(type) {
			case "dog":
				return new Dog("dog", 1);
				
			case "cat":
				return new Cat("cat", 1);
		}
		
		return null;
	}

}
