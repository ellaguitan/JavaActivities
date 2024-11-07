package Laguitan_Exercise9;

public class Main {

	public static void main(String[] args) {
        Object lock = new Object();

        Task task = new Task(lock);
        RunnableTask rTask = new RunnableTask(lock);

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(rTask);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Both threads have completed execution.");
 
	}
}
