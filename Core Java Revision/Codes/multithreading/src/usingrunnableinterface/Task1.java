package usingrunnableinterface;

public class Task1 implements Runnable {
    @Override
    public void run() {
        // Task 1
        for(int i = 1; i <= 5; i++) {
            String currentThread = Thread.currentThread().getName();
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("An exception occurred: " + e.getMessage());
            }
            System.out.println("Task1 is running: " + i + "/5, thread: " + currentThread);
        }
    }
}
