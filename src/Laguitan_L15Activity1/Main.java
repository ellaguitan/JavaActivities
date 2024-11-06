package Laguitan_L15Activity1;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Double num_1, num_2;
		String input = "";
		
		while (input != "e") {
			try {
				System.out.print("1st number: ");
				num_1 = Double.parseDouble(scnr.nextLine());
				System.out.print("2nd number: ");
				num_2 = Double.parseDouble(scnr.nextLine());
				
				GenericsCalculator<Double> gCalc = new GenericsCalculator<>(num_1, num_2);
				
				System.out.println(
						"[A] Addition" +
						"\n[B] Subtraction" +
						"\n[C] Multiplication" +
						"\n[D] Division" +
						"\n[E] Exit Program");
				System.out.print("Operation: ");
				input = scnr.nextLine().toLowerCase();
				
				switch(input) {
					case ("a"):
						gCalc.Addition();
						break;
					case ("b"):
						gCalc.Subtraction();
						break;
					case ("c"):
						gCalc.Multiplication();
						break;
					case ("d"):
						gCalc.Division();
						break;
					case ("e"):
						System.out.println("\nThank you for using our calculator!");
						return;
					default:
						System.out.println("\nKindly choose from the menu.");
				}
				
				System.out.println();
			} catch (NumberFormatException e) {
				System.out.println("Invalid input! Please enter a valid number.");
			}
			
			
		}
		
		scnr.close();
	}
}
