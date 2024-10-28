package Laguitan_Exercise6;

public class Contractor extends Employee{
	private int hoursWorked;
	
	public Contractor(String name, int employeeId, double hourlyRate, int hoursWorked) {
		super(name, employeeId, hourlyRate);
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculatePay() {
		return this.getHourlyRate() * this.hoursWorked;
	}
	
	
}
