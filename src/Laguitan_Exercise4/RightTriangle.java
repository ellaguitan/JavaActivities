package Laguitan_Exercise4;

public class RightTriangle extends Triangle{
	private double height;
	
	public RightTriangle(double s, double b, double h) {
		super(s, b);
		this.height = h;
	}
	
	public double calculateArea() {
		double area = (super.getBase() * this.height) / 2;
		return area;
	}
	
	public double calculatePerimeter() {
		double perimeter = super.getSides() + super.getBase() + this.height;
		return perimeter;
	}
	
	public String toString() {
		return ("sides is " + super.getSides() 
		+ "; base is " + super.getBase() 
		+ "; height is " + this.height);
	}
}
