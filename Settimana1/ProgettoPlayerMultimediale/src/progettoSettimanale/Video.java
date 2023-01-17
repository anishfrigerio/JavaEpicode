/**
 * 
 */
package progettoSettimanale;

/**
 * @author anishfrigerio1999
 *
 */
public class Video extends ElementoMultimediale implements ElementoRiproducibile, ElementoLuminosità {
	private int volume;
	private int durata;
	private int luminosità;
	public Video(String title, int durata, int volume, int luminosità) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setTitle(title);
		this.setDurata(durata);
		this.setVolume(volume);
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

	@Override
	public void alzaVolume() {
		// TODO Auto-generated method stub
		volume++;
		this.setVolume(volume);
		
	}

	@Override
	public void abbassaVolume() {
		// TODO Auto-generated method stub
		volume--;
		this.setVolume(volume);
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(this.getTitle()+ " " +this.getDurata() + ElementoRiproducibile.dispVol.repeat(volume) + "/n" + ElementoLuminosità.dispLum.repeat(luminosità));
		
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		if (durata<=0) {
			System.out.println("Errore inserire una durata valida");
			return;
		}
		this.durata = durata;
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
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume<0 || volume>10) {
			System.out.println("Errore");
			return;
		}
		this.volume = volume;

	}

}
