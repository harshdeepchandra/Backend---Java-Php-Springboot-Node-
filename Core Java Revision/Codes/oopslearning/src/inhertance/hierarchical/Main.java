package inhertance.hierarchical;

public class Main {
    public static void main(String[] args) {
        Betaji1 c1 = new Betaji1();
        Betaji2 c2 = new Betaji2();
        Betaji3 c3 = new Betaji3();

        System.out.println("First child: " + c1.printMyName());
        System.out.println("Second child: " + c2.printMyName());
        System.out.println("Third child: " + c3.printMyName());
    }
}
