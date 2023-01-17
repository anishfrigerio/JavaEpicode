package Progetto_con_il_prof_3_G4_S1.Ex_1;

public class Main {

	public static void main(String[] args) {
		
		Car c1 = new UtilityCar("Ford", "blue", 140);
		Car c2 = new UtilityCar("Fiat", "white", 120);
		
		Car c3 = new SuperCar("Ferrari", "red", 300);
		Car c4 = new SuperCar("Bugatti", "black", 320);
		
		Car[] cars = { c1, c2, c3, c4 };
		
		for( Car c : cars ) { 
			c.getInfo();
			if ( c instanceof SuperCar ) {
				c.run();
			}
		}
		
		c4.accendi();
		for(int i = 0; i < 21; i++) {
			c4.accelera();
			System.out.println( "velocità attuale: " + c4.getSpeed() );
		}
		c4.spegni();

	}

}

//ex 1
//realizzare un'app che gestisce automobili.
//Le entità sono:
//Car (name, color, maxSpeed,  metodi: run(), getInfo() )
//SuperCar( price, run() ridefinito  )
//
//Realizzare un'array di automobili e stampare le info di ognuna,  Se è una supercar, richiamare anche il metodo run.
//
//ex 2
//Realizzare la classe MyArray che accetta un array di interi. 
//Possiede metodi: getMax, getMin, getEven, getOdd
