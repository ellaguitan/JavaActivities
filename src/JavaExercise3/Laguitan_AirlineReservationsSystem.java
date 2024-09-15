package JavaExercise3;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Laguitan_AirlineReservationsSystem {
	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int CAPACITY = 10;
        char[] seats = new char[CAPACITY];
        Arrays.fill(seats, '0');

        boolean isFull = false;

        while (!isFull) {
            System.out.println("\nPlease type 1 for First Class and 2 for Economy.");
            int input = getInput(); 

            if(input == 1) {
                if (!assignSeat(seats, 0, 5, "First Class")) {
                    if (offerAlternative("First Class", "Economy")) {
                        assignSeat(seats, 5, 10, "Economy");
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                        System.out.println("===================================================");
                    }
                }
            } else {
                if (!assignSeat(seats, 5, 10, "Economy")) {
                    if (offerAlternative("Economy", "First Class")) {
                        assignSeat(seats, 0, 5, "First Class");
                    } else {
                        System.out.println("Next flight leaves in 3 hours.");
                        System.out.println("===================================================");
                    }
                }
            }

            System.out.println("\nCurrent seat status: " + Arrays.toString(seats));

            isFull = checkIfFull(seats);
        }
    }

    private static int getInput() {
        int input = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("\nEnter value: ");
            try {
                input = scanner.nextInt();

                if (input < 1 || input > 2) {
					System.out.println("\n==========================================================================");
                    System.err.println("Input invalid. The possible inputs are: 1 for First Class or 2 for Economy.");
					System.out.println("==========================================================================");
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
				System.out.println("\n==========================================================================");
                System.err.println("Input invalid. The possible inputs are: 1 for First Class or 2 for Economy.");
				System.out.println("==========================================================================");
                scanner.next(); // Clear the invalid input
            }
        }
        return input;
    }

    private static boolean assignSeat(char[] seats, int start, int end, String sectionName) {
        for (int i = start; i < end; i++) {
            if (seats[i] == '0') { // '0' means available
                seats[i] = 'X'; // 'X' means occupied
                System.out.println("\n====================================");
                System.out.println("Thank you for choosing this Airline.");
                System.out.println("Your seat number is " + (i + 1) + " in " + sectionName);
                System.out.println("====================================");
                return true;
            }
        }

        System.out.println("\n===================================================");
        System.err.println(sectionName + " section is full.");
        
        return false;
    }

    private static boolean offerAlternative(String fullSection, String altSection) {
        char yn = ' ';
        boolean validInput = false;

        while (!validInput) {
            System.err.println("\nWould you like to be placed in the " + altSection + " section?");
            System.out.print("Enter input (y/n): ");
            try {
                yn = scanner.next().charAt(0);
                if (yn == 'y' || yn == 'Y' || yn == 'n' || yn == 'N') {
                    validInput = true;
                } else {
					System.out.println("\n===============================================");
                    System.err.println("Input invalid. The possible inputs are: y or n.");
					System.out.println("===============================================");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n===============================================");
                System.err.println("Input invalid. The possible inputs are: y or n.");
                System.out.println("===============================================");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("===================================================");
        return yn == 'y' || yn == 'Y';
    }

    private static boolean checkIfFull(char[] seats) {
        for(char seat: seats) {
            if(seat == '0') {
                return false;
            }
        }
        System.out.println("\nThe plane is fully booked.\n");
        return true;
    }
}
