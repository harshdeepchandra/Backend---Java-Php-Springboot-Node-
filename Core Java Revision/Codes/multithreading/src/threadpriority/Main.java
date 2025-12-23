package threadpriority;

public class Main {
    public static void main(String[] args) {
        Task t1 = new Task();
        Task t2 = new Task();
        Task t3 = new Task();
        Task t4 = new Task();
        Task t5 = new Task();

        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t4.setName("t4");
        t5.setName("t5");

        t1.setPriority(3);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(10);
        t5.setPriority(10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t5.yield();
        System.out.println("T5 yielded");
    }
}
