/**
 * 
 */
package s2l4es1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author anishfrigerio1999
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Esercizio 1
		List<Prodotto> prod = new ArrayList<Prodotto>(){{
				add(new Prodotto(100L, "Harry Potter Set", "Books", 105.50));
				add(new Prodotto(101L, "Peter Pan", "Books", 12.50));
				add(new Prodotto(102L, "Biberon", "Baby", 7.75));
				add(new Prodotto(103L, "Tutina", "Baby", 23.99));
				add(new Prodotto(104L, "Hot Wheels","Boys", 34.50));
		}};
		Stream<Prodotto> booksStream = 
				prod.stream().filter(
					(p) -> p.getCategory() == "Books"	
				).filter(p->p.getPrice()>100);
		booksStream.forEach((p)->{
			System.out.println(p);
		});
		
		
		Stream<Prodotto> babyStream = prod.stream().filter(p->p.getCategory()=="Baby");
		babyStream.forEach(p-> System.out.println(p));
		
		Stream<Prodotto> boyStream = prod.stream().filter(p->p.getCategory()=="Boys");
		boyStream.forEach(p->{
			p.setPrice(applicaSconto(10, p.getPrice()));
			System.out.println(p+". Sconto applicato del 10 percento");
		});
		
	

	}
	static Double applicaSconto(int percent, double prezzo) {
		return prezzo - ((prezzo*percent)/100);
	}

}
class Prodotto{
	private Long id;
	private String name;
	private String category;
	private Double price;
	
	public Prodotto(Long id, String name, String category, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "L'id del prodotto è: "+this.id+", il nome è: "+this.name+", la categoria è: "+this.category+", il prezzo è: "+this.price;
		
	}
}
