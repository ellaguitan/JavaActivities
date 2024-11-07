package Laguitan_Exercise9;

import java.util.LinkedList;
import java.util.Queue;

public class Task extends Thread {
    private final Object lock; 

    public Task(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Queue<String> messageQueue = new LinkedList<>();
        messageQueue.add("Hello");
        messageQueue.add("My name is JavaBot");
        messageQueue.add("Nice to meet you!");

        synchronized (lock) {
            while (!messageQueue.isEmpty()) {
                System.out.println(Thread.currentThread().getName() + " sends: " + messageQueue.poll());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " interrupted.");
                }
            }
            System.out.println(Thread.currentThread().getName() + " has finished execution.\n");
        }
    }
}
