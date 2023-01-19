/**
 * 
 */
package s2l3es1;
import java.util.*;
/**
 * @author anishfrigerio1999
 *
 */
public class Main extends Thread {
	char ch;
	public Main(char ch) {
		this.ch = ch;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ch1 = new Main('*');
		Main ch2 = new Main('#');
		
		ch1.start();
		ch2.start();

	}
	public void runArray() {
		for (int i = 0;i<10;i++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println("errore");
			}
			
		}
		
	}
	@Override
    public void run() {

        this.runArray();
    }

}
