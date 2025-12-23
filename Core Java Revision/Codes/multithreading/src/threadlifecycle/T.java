package threadlifecycle;

public class T extends Thread {
    @Override
    public void run() {
        for(int i=1; i<=10; i++) {
            System.out.println("Task1: " + i + "/100");
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("An exception occurred: " + e.getMessage());
            }
        }
    }
}
