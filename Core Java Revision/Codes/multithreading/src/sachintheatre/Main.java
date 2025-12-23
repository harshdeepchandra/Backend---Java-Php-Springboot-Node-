package sachintheatre;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre();

        Thread p1 = new Thread(theatre);
        Thread p2 = new Thread(theatre);
        Thread p3 = new Thread(theatre);

        p1.setName("Abhishek");
        p2.setName("Aman");
        p3.setName("Amar");

        p1.start();
        p2.start();
        p3.start();
    }
}
