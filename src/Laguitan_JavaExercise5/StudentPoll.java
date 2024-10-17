package Laguitan_JavaExercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class StudentPoll {
	private static File numbersFile = new File("numbers.txt");
	private static File outputFile = new File("output.txt");

	public static void main(String[] args) throws IOException {
		int response = 0;
		Scanner inpScnr = new Scanner(System.in);
		
		System.out.println("WELCOME TO SURVEY RESPONSES");
		
		do {
			System.out.print("\nEnter survey response from 1-10: ");
			response = inpScnr.nextInt();
			
			if (response > 10 && response <= 0) {
				break;
			}
			
			format(response);
		} while (true);
		
		inpScnr.close();
	}
	
	public static void format(int response) throws FileNotFoundException {
		Formatter formatter = new Formatter(numbersFile);
		formatter.format("%d\n", response);		
	}

}
