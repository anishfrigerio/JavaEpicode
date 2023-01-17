/**
 * 
 */
package progettoSettimanale;

/**
 * @author anishfrigerio1999
 *
 */
abstract public class ElementoMultimediale {
	private String title;
	
	public ElementoMultimediale(String title) {
		// TODO Auto-generated constructor stub
		this.setTitle(title);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
