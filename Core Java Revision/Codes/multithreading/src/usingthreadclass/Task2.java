package usingthreadclass;

public class Task2 extends Thread {
    @Override
    public void run() {
        // Task 2
        for(int j = 1; j <= 10; j++) {
            String currentThread = Thread.currentThread().getName();
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("An exception occurred: " + e.getMessage());
            }
            System.out.println("Task2 is running: " + j + "/10, thread: " + currentThread);
        }
    }
}
