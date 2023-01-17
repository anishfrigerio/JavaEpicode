package s1l3e1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una stringa");
		String str = input.next();
		System.out.println(stringaPariDispari(str));
		System.out.println("Inserisci un anno");
		int anno = input.nextInt();
		if (annoBisestile(anno)) {
			System.out.println("Anno bisestile");
		}else {
			System.out.println("Anno non bisestile");
		}
		input.close();
		
	}
	static Boolean stringaPariDispari(String parola) {
		if(parola.length()%2==0) {
			return true;
		}else {
			return false;
		}	
	}
	static Boolean annoBisestile(int year) {
		if ((year%4 == 0) || (year%100==0) && (year%400==0)) {
		    return true;
		}else {
			return false;
		}
	
	}
}

