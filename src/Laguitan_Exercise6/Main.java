package Laguitan_Exercise6;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new FullTimeEmployee("Charlaine", 1, 39000);
		Employee emp2 = new ParttimeEmployee("Mark", 2, 100.70, 300);
		Employee emp3 = new Contractor("Paulo", 3, 105.12, 350);
		
		System.out.println(emp1.getName() + "'s pay: " + emp1.calculatePay());
		System.out.println(emp2.getName() + "'s pay: " + emp2.calculatePay());
		System.out.println(emp3.getName() + "'s pay: " + emp3.calculatePay());
	}

}
