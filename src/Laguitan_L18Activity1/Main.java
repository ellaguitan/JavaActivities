package Laguitan_L18Activity1;

public class Main {

	public static void main(String[] args) {
		Printer printer1 = new Printer("Manuscript_Final.pdf");
		Printer printer2 = new Printer("Manuscript_Final_Final.pdf");
		
		Thread thread1 = new Thread(printer1);
		Thread thread2 = new Thread(printer2);
		
		try {
			thread1.start();
			thread2.start();
			
			thread1.join();
			thread2.join();
			
			System.out.println("\nThread has ended.");
			
			if (!thread1.isAlive()) {
				System.out.println(thread1.getName() +" status: terminated");
			} 
			
			if (!thread2.isAlive()) {
				System.out.println(thread2.getName() +" status: terminated");
			}

		}  catch (InterruptedException e) {
            System.out.println("Interrupted.");
        }
	}

}
