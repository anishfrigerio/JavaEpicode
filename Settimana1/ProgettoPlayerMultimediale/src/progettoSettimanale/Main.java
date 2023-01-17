/**
 * 
 */
package progettoSettimanale;
import java.util.Scanner;
import java.util.Arrays;
/**
 * @author anishfrigerio1999
 *
 */
public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElementoMultimediale audio1 = new Audio("anish",3,4);
		((Audio)audio1).abbassaVolume();
		((Audio) audio1).play();
		Scanner input = new Scanner(System.in);
		ElementoMultimediale[] media = {};
		int i = 0;
		while(media.length<5){
			System.out.println("Inserisci dettagli media in questo ordine separati da una virgola: titolo, durata, volume, luminosità");
			String det = input.nextLine();
			String[] values = det.split(",");
			System.out.println(values[0]);
			Arrays.toString(values);
			if(values[1]==null) {
				Immagine img = new Immagine(values[0],Integer.valueOf(values[3]));
				media[i]= img;
			}else if(values[3]==null) {
				Audio aud = new Audio(values[0],Integer.valueOf(values[1]),Integer.valueOf(values[2]));
				media[i]= aud;
			}else {
				Video vid = new Video(values[0],Integer.valueOf(values[1]),Integer.valueOf(values[2]),Integer.valueOf(values[3]));
				media[i]=vid;
			}
			i++;
			System.out.println(Arrays.toString(media));
			
		}
		System.out.println(media);
		input.close();
		
		


        

	}

}
