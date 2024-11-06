package Laguitan_L15Activity1;

public class GenericsCalculator<T extends Number> {
	private T num_1;
	private T num_2;
	
	public GenericsCalculator(T num_1, T num_2) {
		this.num_1 = num_1;
		this.num_2 = num_2;
	}
	
	
	public void Addition() {
		System.out.println(num_1 + " + " + num_2 + " = " + String.format("%.2f", num_1.doubleValue() + num_2.doubleValue()));
	}
	
	
	public void Subtraction() {
		System.out.println(num_1 + " - " + num_2 + " = " + String.format("%.2f", num_1.doubleValue() - num_2.doubleValue()));
	}
	
	public void Multiplication() {
		System.out.println(num_1 + " * " + num_2 + " = " + String.format("%.2f", num_1.doubleValue() * num_2.doubleValue()));
	}
	
	public void Division() {
		if (num_2.doubleValue() != 0) {
			System.out.println(num_1 + " / " + num_2 + " = " + String.format("%.2f", num_1.doubleValue() /num_2.doubleValue()));
		} else {
			System.out.println("Division by zero is undefined.");
		}
	}
}