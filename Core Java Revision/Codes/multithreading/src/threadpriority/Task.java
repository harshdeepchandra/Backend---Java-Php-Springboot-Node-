package threadpriority;

public class Task extends Thread {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        for(int i = 1; i <= 10; i++) {
//            try {
//                Thread.sleep(000);
//            } catch(InterruptedException e) {
//                System.out.println("An exception occurred: " + e.getMessage());
//            }
            System.out.println("Task: " + name + ", Status: " + i + "/10, Priority: " + priority);
        }
        System.out.println("Task: " + name + " completed");
    }

}
