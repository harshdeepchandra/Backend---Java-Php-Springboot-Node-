package usingthreadclass;

public class Main {
    public static void main(String[] args) {
        Task2 t2 = new Task2();
        t2.setName("zingzong");
        t2.start();

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
