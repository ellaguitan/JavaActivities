package Laguitan_L11Activity;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter; 
import java.io.IOException;
import java.util.Scanner; 

public class BookRentalSystem {

	public static Book[] library = {new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1954),
			new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960),
			new NonFictionBook("The Tipping Point", "M. Gladwell", 2000),
			new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997)};

	public static File f = new File("library.txt");
	
	public static void main(String[] args) throws IOException {	
		writeToFile();
		readFromFile();
	}
	
	public static void writeToFile() throws IOException {
		String content = "* * * * * * * * * * * * L I B R A R Y * * * * * * * * * * * *";
		
		FileWriter fw = new FileWriter(f);
		
		for(int i = 0; i < library.length; i++) {
			content += "\n" + library[i].toString();
		}
		
		content += "\n\n* * * * * * * * * * BOOKS RENTED, NEVER READ * * * * * * * * * *";
		
		for(int i = 0; i < library.length; i++) {
			if (library[i].getTitle().equals("The Lord of the Rings") || library[i].getTitle().equals("The Tipping Point")) {
				library[i].rent();
			}
		}
		
		for(int i = 0; i < library.length; i++) {
			if (library[i].isRented()) {
				content += "\n" + library[i].toString();
			}
		}
		
		fw.write(content);
		fw.flush();
		fw.close();
		
	}
	
	public static void readFromFile() throws FileNotFoundException {
		Scanner scn = new Scanner(f);
		
		while (scn.hasNextLine()) {
			System.out.println(scn.nextLine());
		}
		
		scn.close();
	}
}
