package Laguitan_L4Activity1;

import java.util.Scanner;

public class Phonebook {

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 5;
        int temp = 0;
        String pName = "";
        long pNumber = 0;
        String[] name = new String[ARRAY_LENGTH];
        long[] phoneNumbers = new long[ARRAY_LENGTH];
        Scanner scn = new Scanner(System.in);

        while (temp < ARRAY_LENGTH) {
            while (true) {
            	System.out.print("\nInput Name #" + (temp + 1) + ": ");
                pName = scn.nextLine();
                if (pName.equalsIgnoreCase("n/a")) {
                    System.out.println();
                    break;
                } else {
                    name[temp] = pName;
                }
                System.out.print("Input Phone Number of Name #" + (temp + 1) + ": ");
                try {
                    pNumber = Long.parseLong(scn.nextLine());
                    OutOfBoundDigitsException.validateDigits(pNumber);
                    phoneNumbers[temp] = pNumber;
                    break; // Exit loop if input is valid
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Only whole numbers are allowed.");
                } 
                catch (OutOfBoundDigitsException e) {
                    System.out.println(e.getMessage());
                }
            }
            
            if (pName.equalsIgnoreCase("n/a")) {
                break;
            }

            System.out.println();
            temp++;
        }

        for (int i = 0; i < ARRAY_LENGTH; i++) {
        	if (name[i] == null) {
        		break;
        	}
            System.out.println("[" + (i + 1) + "]" + name[i]);
        }
        
        System.out.print("\nSearch a name: ");
        String sName = scn.nextLine();

        for (int i = 0; i <= ARRAY_LENGTH; i++) {
            if (i == ARRAY_LENGTH || name[i] == null) {
                System.out.println("Contact does not exist.");
                break;
            } else {
                if (name[i].equalsIgnoreCase(sName)) {
                    System.out.println("\nName: " + name[i]);
                    System.out.println("Phone Number: " + phoneNumbers[i]);
                    break;
                }
            }
        }

        scn.close();
    }
}