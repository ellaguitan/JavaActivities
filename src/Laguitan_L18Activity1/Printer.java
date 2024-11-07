package Laguitan_L18Activity1;

public class Printer implements Runnable {
	private String docName;

	public Printer(String docName) {
		super();
		this.docName = docName;
	}
	
	public void printDocuments() {
		
		System.out.println("\nPrinting: " + docName);
		synchronized (Printer.class) {
			try {
				Thread.sleep(2000);
				
				if (Thread.currentThread().isAlive()) {
					System.out.println("\n"+ Thread.currentThread().getName() +" status: running");
				} 
				
				System.out.println("\nFinished printing: " + docName);
			} catch (InterruptedException e){
				System.out.println("\n" + Thread.currentThread() + ": Printing was interrupted");
			}
		}
	}
	
	@Override
	public void run() {
		printDocuments();
	}
}
