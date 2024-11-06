package Laguitan_L16Activity2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Playlist playlist = new Playlist();
		
		while(true) {
			System.out.println(
	                    "\n1. Add song to playlist"
	                    + "\n2. Display playlist"
	                    + "\n3. Remove a song from playlist"
	                    + "\n4. Play next song"
	                    + "\n5. Exit");
	            
			int choice = -1;
	            
	    	while (true) {
	        	System.out.print("\nEnter your choice: ");
	                
	         	try {
	         		choice = scanner.nextInt();
	            	scanner.nextLine();  // Clear the buffer
	            	break;  // Exit the loop if the input is valid
	            } catch (InputMismatchException e) {
	            	System.out.println("Invalid input. Please enter a number between 1 and 5.");
	            	scanner.nextLine();  // Clear the invalid input
	            }
	        }
			
			switch(choice) {
			case 1:
				System.out.print("Enter song title: ");
				String title = scanner.nextLine();
				System.out.print("Enter artist name: ");
				String artist = scanner.nextLine();
				playlist.addSong(title, artist);
				break;
			case 2:
				playlist.displayPlaylist();
				break;
			case 3:
				System.out.print("Enter name of song to remove: ");
				title = scanner.nextLine();
				playlist.removeSong(title);
				break;
			case 4:
				playlist.displayCurrentSong();
				playlist.displayNextSong();
				break;
			case 5:
				System.out.println("Exiting playlist.");
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
			
		
	}

}
