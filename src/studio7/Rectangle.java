package studio7;

public class Rectangle {
	public double length, width;

	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}

	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return this.length + this.width;
	}
	
	public boolean isSquare() {
		if (length == width) {
			return true;
		}
		else {
			return false;	
		}
	}
}


