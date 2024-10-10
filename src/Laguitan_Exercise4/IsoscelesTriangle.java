package Laguitan_Exercise4;

public class IsoscelesTriangle extends Triangle {
	public IsoscelesTriangle(double s, double b) {
		super(s, b);
	}
	
	public double calculateArea() {
		double area = (0.5) * 
				super.getBase() * 
				Math.sqrt(
						Math.pow(super.getSides(), 2) - 
						Math.pow(super.getBase(), 2) 
						/ 4);
		return area;
	}
	
	public double calculatePerimeter() {
		double perimeter = super.getBase() + (2 * super.getSides());
		return perimeter;
	}
	
	public String toString() {
		return ("sides is " + super.getSides() 
		+ " and base is " + super.getBase());
	}
}
