package threadlifecycle;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.setName("t1");
        t.start();
//        System.out.println(t.isAlive());
        t.join();
        System.out.println(t.isAlive());
//        Thread.sleep(1000);
//        System.out.println(t.isAlive());
//        Thread.sleep(7000);
//        System.out.println(t.isAlive());
//        Thread.sleep(4000);
//        System.out.println(t.isAlive());

        System.out.println("Exit");
    }
}
