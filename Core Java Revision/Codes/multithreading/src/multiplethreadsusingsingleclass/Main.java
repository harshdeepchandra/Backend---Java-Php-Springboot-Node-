package multiplethreadsusingsingleclass;

public class Main {
    public static void main(String[] args) {
        Task t1 = new Task("t1", 5, "zing");
        Task t2 = new Task("t2", 10, "zong");
        Task t3 = new Task("t3", 7, "ping");
        Task t4 = new Task("t4", 15, "pong");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
