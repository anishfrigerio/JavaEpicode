/**
 * 
 */
package s1l3e3;
import java.util.Scanner;
/**
 * @author anishfrigerio1999
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Inserisci una stringa (per interrompere scrivi :q): ");
            String str = input.nextLine();
            if (str.equals(":q")) {
            	System.out.println("Ciao");
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                if (i < str.length() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        input.close();
    }

}
