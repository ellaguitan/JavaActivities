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
		Formatter formatter = new Formatter(numbersFile);
		Scanner inpScnr = new Scanner(System.in);
		
		int response = 0;
		
		System.out.println("WELCOME TO SURVEY RESPONSES");
		
		do {
			System.out.print("\nEnter survey response from 1-10: ");
			response = inpScnr.nextInt();
			
			if (response > 10 || response <= 0) {
				break;
			}
			
			System.out.println(response);		
			
			formatter.format("%d%n", response);	
		} while (true);
		
		formatter.close();
		inpScnr.close();

		Scanner scn = new Scanner(numbersFile);
		
		Formatter outputFormatter = new Formatter(outputFile);
		
		while (scn.hasNextInt()) {
			outputFormatter.format("%d%n", scn.nextInt());	
		}
		
		outputFormatter.close();
		scn.close();
	}
}
