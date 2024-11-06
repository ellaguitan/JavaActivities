package Laguitan_L16Activity3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner scnr = new Scanner(System.in);
    	Phonebook phonebook = new Phonebook();
    	final int ARRAY_LENGTH = 5;
    	int input = 0;
    	
    	while (true) {
            System.out.println(
                "\nEl's Phonebook" +
                "\n[1] Add Contacts" + 
                "\n[2] Display Contacts" +
                "\n[3] Search Contact" +
                "\n[4] Close"
            );
            
            try {
                System.out.print("Enter your choice: ");
                input = Integer.parseInt(scnr.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Available input is 1-4 only.");
                continue;  
            }
            
            switch (input) {
                case 1:
                	if (phonebook.getSize() >= 5) {
                        System.out.println("Phonebook is full. Cannot add more contacts.");
                        break;
                    }
                	
                	while (phonebook.getSize() < ARRAY_LENGTH) {
                        System.out.print("\nInput name here (or type 'n/a' to cancel): ");
                        String name = scnr.nextLine();
                        
                        if (name.equalsIgnoreCase("n/a")) {
                            System.out.println("Cancelled adding contact.");
                            break;
                        }
                        
                        while (true) {
                            try {
                                System.out.print("Input phone number here: ");
                                Long phonenumber = Long.parseLong(scnr.nextLine());
                                OutOfBoundDigitsException.validateDigits(phonenumber);
                                phonebook.addContact(name, phonenumber);
                                break; 
                            } catch (NumberFormatException e) {
                                System.out.println("Invalid input! Only whole numbers are allowed.");
                            } catch (OutOfBoundDigitsException e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                    break;
                case 2:
                    phonebook.displayContacts();
                    break;
                case 3:
                	System.out.print("\nSearch a name: ");
                    String sName = scnr.nextLine();
                    phonebook.searchContact(sName);
                    break;
                case 4:
                    System.out.println("Closing contacts.");
                    scnr.close();
                    System.exit(0); 
                default:
                    System.out.println("Invalid input. Available input is 1-4 only.");
            }
        }
    	
    	
    }
    
    static class OutOfBoundDigitsException extends Exception {
    	
    	public OutOfBoundDigitsException(String message) {
    		super(message);
    	}
    	
    	public static void validateDigits(long number) throws OutOfBoundDigitsException{
    		String str  = String.valueOf(number);
    		int str_length = str.length();
    		boolean isValid = false;
    		
    		if (str_length == 10) {
    			isValid = true;
    		}
    		
    		if (!isValid) {
    			throw new OutOfBoundDigitsException("Invalid phone number! Only 10-digit numbers are allowed.");
    		}
    	}
    	
    }
}