/**
 * 
 */
package s1.l2.es1;
import java.util.Scanner;
/**
 * @author anishfrigerio1999
 *
 */
public class Main {

	public static void main() {
		// Creiamo uno scanner per l'input dell'utente
		Scanner input = new Scanner(System.in);
		//Chiediamo all'utente di inserire l'altezza del rettangolo
		System.out.println("Inserisci altezza del primo rettangolo");
		//Salviamo l'input in una variabile
		double altezza1 = input.nextDouble();
		//Chiediamo all'utente di inserire la larghezza del rettangolo
		System.out.println("Inserisci larghezza del primo rettangolo");
		//Salviamo l'input in una variabile
		double larghezza1 = input.nextDouble();
		/*Creaiamo un rettagolo usando la classe Rettangolo che abbiamo scritto,
		passando come parametri le variabili che abbiamo salvato*/
		Rettangolo rect1 = new Rettangolo(altezza1, larghezza1);
		//Stampiamo l'area e il perimetro usando il metodo stampaRettangolo che abbiamo definito nella classe Rettangolo
		Rettangolo.stampaRettangolo(rect1);
		//Ripetiamo il procedimento per creare un altro rettangolo
		System.out.println("Inserisci altezza del secondo rettangolo");
		double altezza2 = input.nextDouble();
		System.out.println("Inserisci larghezza del secondo rettangolo");
		double larghezza2 = input.nextDouble();
		Rettangolo rect2 = new Rettangolo(altezza2, larghezza2);
		Rettangolo.stampaRettangolo(rect2);
		System.out.println("-------------------------------------------------");
		/*Stampiamo la somma dell'area e del perimetro dei due rettangoli creati usando il metodo definito nella classe
			Rettangolo*/
		Rettangolo.stampaDueRettangoli(rect1, rect2);
		//Chiudiamo lo scanner per non sprecare risorse 
		input.close();
	}
	
	
}
