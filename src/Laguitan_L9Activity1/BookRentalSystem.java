package Laguitan_L9Activity1;

public class BookRentalSystem {	
	public static Book[] library = {new FictionBook("The Lord of the Rings", "J.R.R. Tolkien", 1954),
			new FictionBook("To Kill a Mockingbird", "Harper Lee", 1960),
			new NonFictionBook("The Tipping Point", "M. Gladwell", 2000),
			new NonFictionBook("Guns, Germs, and Steel", "Jared Diamond", 1997)};
	
	public static void main(String[] args) {	
		displayBooks();
		rentedBooks();
	}
	
	public static void displayBooks() {
		System.out.println("* * * * * * * * * * L I B R A R Y * * * * * * * * * *");
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i].toString());
		}
	}
	
	public static void rentedBooks() {
		for(int i = 0; i < library.length; i++) {
			if (library[i].getTitle().equals("The Lord of the Rings") || library[i].getTitle().equals("The Tipping Point")) {
				library[i].rent();
			}
		}
		
		System.out.println("\n* * * * * * * * * * BOOKS RENTED, NEVER READ * * * * * * * * * *");
		
		for(int i = 0; i < library.length; i++) {
			if (library[i].isRented()) {
				System.out.println(library[i].toString());
			}
		}
	}

}
