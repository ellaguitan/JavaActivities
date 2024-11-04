package Laguitan_L4Activity1;

import java.util.Scanner;

public class Phonebook {

	public static void main(String[] args) {
		final int ARRAY_LENGTH = 5;
		int temp = 0;
		String pName = "";
		String pNumber = "";
		String[] name = new String[ARRAY_LENGTH];
		String[] phoneNumbers = new String[ARRAY_LENGTH];
		Scanner scn = new Scanner(System.in);
		
		while (temp < ARRAY_LENGTH) {
			System.out.print("Input Name #" + (temp + 1) + ": ");
			pName = scn.nextLine();
			if (pName.equalsIgnoreCase("n/a")) {
				System.out.println();
				break;
			} else {
				name[temp] = pName;
			}
			System.out.print("Input Phone Number of Name #" + (temp + 1) + ": ");
			pNumber = scn.nextLine();
			phoneNumbers[temp] = pNumber;
			
			System.out.println();
			temp++;
		}
		
		for (int i = 0; i < ARRAY_LENGTH; i++) {
			System.out.println("[" + (i + 1) + "]" + name[i]);
		}
		
		System.out.print("\nSearch a name: ");
		String sName = scn.nextLine();
		
		for(int i = 0; i <= ARRAY_LENGTH; i++) {
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
