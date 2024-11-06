package Laguitan_L16Activity1;
import java.util.ArrayList;

public class BookRentalSystem {	
	public static ArrayList<Book> library = new ArrayList<>();
	
	public static void main(String[] args) {	
		addBooks();
		displayBooks();
		rentedBooks();
	}
	
	public static void addBooks() {
		library.add(new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1954));
		library.add(new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960));
		library.add(new NonFictionBook("The Tipping Point", "M. Gladwell", 2000));
		library.add(new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997));
	}
	
	public static void displayBooks() {
		System.out.println("* * * * * * * * * * L I B R A R Y * * * * * * * * * *");
		for(int i = 0; i < library.size(); i++) {
			System.out.println(library.get(i));
		}
	}
	
	public static void rentedBooks() {
		for(int i = 0; i < library.size(); i++) {
			if (library.get(i).getTitle().equals("The Lord of the Rings") || library.get(i).getTitle().equals("The Tipping Point")) {
				library.get(i).rent();
			}
		}
		
		System.out.println("\n* * * * * * * * * * BOOKS RENTED, NEVER READ * * * * * * * * * *");
		
		for(int i = 0; i < library.size(); i++) {
			if (library.get(i).isRented()) {
				System.out.println(library.get(i).toString());
			}
		}
	}
}
