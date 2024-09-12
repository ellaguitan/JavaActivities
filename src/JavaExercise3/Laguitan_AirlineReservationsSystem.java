package JavaExercise3;
import java.util.Arrays;
import java.util.Scanner;

public class Laguitan_AirlineReservationsSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please type 1 for First Class and 2 for Economy.");
		final int CAPACITY = 10;
		char[] seats = new char[CAPACITY];
		
		Arrays.fill(seats, '0');
		
		boolean isFull = false;
		
		while (!isFull) {
			int input = 0;
			char yn = 0;
			boolean firstClassIsFull = false;
			boolean economyIsFull = false;
			Scanner scanner= new Scanner(System.in);
			
			
			while(input < 1 || input > 2) {
				System.out.print("\nEnter value: ");
				input = scanner.nextInt();
				
				if (input < 1 || input > 2) {
					System.err.println("Not a valid input. Please try again.");
				}
			}
			
			// to refactor
			if (input == 1) {
				if (!firstClassIsFull) {
					for (int i = 0; i < 5; i++) {
						if (i == 4) {
							firstClassIsFull = true;
						}
						if (seats[i] == '0') {
							seats[i] = 'X';
							System.out.println("Thank you for choosing Airlines. Your seat number is " + (i + 1));
							break;
						}
					}
				} else { // to fix
					System.err.println("First-class section is full. Would you like to be placed in the economy section?");
					System.out.print("Enter input (y/n):");
					yn = scanner.next().charAt(0);
				}
			} else {
				if (!economyIsFull) {
					for (int i = 5; i < 10; i++) {
						if (i == 9) {
							economyIsFull = true;
						}
						if (seats[i] == '0') {
							seats[i] = 'X';
							break;
						}
					}
				} else {
					System.err.println("Economy section is full. Would you like to be placed in the first-class section?");
					System.out.print("Enter input (y/n):");
					yn = scanner.next().charAt(0);
				}
			}
			
			System.out.println(Arrays.toString(seats));
		}
	}
}
