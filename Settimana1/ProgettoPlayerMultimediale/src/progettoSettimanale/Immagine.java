/**
 * 
 */
package progettoSettimanale;

/**
 * @author anishfrigerio1999
 *
 */
public class Immagine extends ElementoMultimediale implements ElementoLuminosità {

	private int luminosità;
	public Immagine(String title, int luminosità) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setTitle(title);
		this.setLuminosità(luminosità);
	}

	@Override
	public void alzaLuminosità() {
		// TODO Auto-generated method stub
		luminosità++;
		this.setLuminosità(luminosità);
		
	}

	@Override
	public void abbassaLuminosità() {
		// TODO Auto-generated method stub
		luminosità--;
		this.setLuminosità(luminosità);
		
	}

	public int getLuminosità() {
		return luminosità;
	}

	public void setLuminosità(int luminosità) {
		if (luminosità<0 || luminosità>10) {
			System.out.println("Errore");
			return;
		}
		this.luminosità = luminosità;
		ElementoLuminosità.dispLum.repeat(luminosità);
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(this.getTitle()+ dispLum);
		
	}

}
