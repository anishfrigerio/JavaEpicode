package week1.day4.animals;

public class Human implements Jumpable, Runnable {
	
	public Human(String n) {}

	@Override
	public void jumpVertically(int cm) {
		System.out.println("jump v" + cm);
	}

	@Override
	public void jumpHorizontally(int cm) {
		System.out.println("jump h" + cm);
	}

	@Override
	public void run(int km) {
		System.out.println("run " + km);
	}
	
}
