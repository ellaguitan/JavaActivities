package Laguitan_L4Activity1;

public class OutOfBoundDigitsException extends Exception {
	
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