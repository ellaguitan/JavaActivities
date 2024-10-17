package Laguitan_Exercise4;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RightTriangle rightTriangle = new RightTriangle(3, 4, 5);
		IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(3, 5);
		
		System.out.println(rightTriangle.toString());
		System.out.println("Area of Right Triangle: " + rightTriangle.calculateArea());
		System.out.println("Perimeter of Right Triangle: " + rightTriangle.calculatePerimeter());
		
		System.out.println("\n" + isoscelesTriangle.toString());
		System.out.println("Area of Isosceles Triangle: " + isoscelesTriangle.calculateArea());
		System.out.println("Perimeter of Isosceles Triangle: " + isoscelesTriangle.calculatePerimeter());
	}

}