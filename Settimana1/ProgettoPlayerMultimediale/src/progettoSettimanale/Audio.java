/**
 * 
 */
package progettoSettimanale;

/**
 * @author anishfrigerio1999
 *
 */
public class Audio extends ElementoMultimediale implements ElementoRiproducibile {

	private int durata;
	private int volume;
	public Audio(String title, int durata, int volume) {
		// TODO Auto-generated constructor stub
		super(title);
		this.setTitle(title);
		this.setDurata(durata);
		this.setVolume(volume);
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
		System.out.println(this.getTitle() + " " + this.getDurata() + " " + ElementoRiproducibile.dispVol.repeat(volume));
		
		
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
