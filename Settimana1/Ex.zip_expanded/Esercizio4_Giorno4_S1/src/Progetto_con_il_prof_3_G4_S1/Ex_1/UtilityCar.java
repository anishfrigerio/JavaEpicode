package Progetto_con_il_prof_3_G4_S1.Ex_1;

public class UtilityCar extends Car {
	
	public UtilityCar(String name, String color, int maxSpeed) {
		super(name, color, maxSpeed);
	}

	@Override
	public void run() {
		
		System.out.println( "Ciao sono un vigile!" );
		
	}

}
