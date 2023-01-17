package week1.classes;

public class Box {
	public int w, h;
	
	public Box(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public double getArea() { return this.w * this.h; }
	public double getPerimeter() { return (this.w + this.h) * 2; }
	
	@Override
	public boolean equals(Object externalBox) {
		return getArea() == ((Box)externalBox).getArea();
	}
}
