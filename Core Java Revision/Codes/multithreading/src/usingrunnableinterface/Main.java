package usingrunnableinterface;

public class Main {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Thread task1Thread = new Thread(t1);

        task1Thread.setName("pingpong");
        task1Thread.start();

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
