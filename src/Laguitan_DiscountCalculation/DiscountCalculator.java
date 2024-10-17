package Laguitan_DiscountCalculation;
import java.util.Scanner;

public class DiscountCalculator {

	public static void main(String[] args) {
		long start = System.nanoTime();
		
		int discount = calculateDiscount();
		
		long end = System.nanoTime();
		
		if (discount == -1) {
			System.out.println("\nThis situation is logically impossible.");
		} else {
			System.out.println("\nYour Total Discount is: " + discount + "%");
		}
		
		System.out.println("\nElapsed time in ms: " + ((end - start)/1000000));
	}
	
	public static int calculateDiscount() {
		Scanner scanner = new Scanner(System.in);
		
		int discount = 0;
		
		System.out.print("\nIs a new Customer? (y/n): ");
		boolean isNewCustomer = scanner.next().equalsIgnoreCase("y");
		System.out.print("\nHas a Loyalty Card? (y/n): ");
		boolean hasLoyaltyCard = scanner.next().equalsIgnoreCase("y");
		System.out.print("\nHas a Coupon Discount? (y/n): ");
		boolean hasCoupon = scanner.next().equalsIgnoreCase("y");
		
		if (isNewCustomer && hasLoyaltyCard) {
			return -1;
		} 
		
		if (isNewCustomer) {
			discount += 15;
		} 
		if (hasLoyaltyCard) {
			discount += 10;
		} 
		if (hasCoupon) {
			discount += 20;
			if (isNewCustomer) {
				discount = 20;
			}
		}
		
		return discount;
	}

}
