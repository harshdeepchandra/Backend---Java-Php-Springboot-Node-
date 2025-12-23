package staticblock;

public class Laptop {

    static {
        System.out.println("Inside static block");
    }

    public Laptop() {
        System.out.println("Inside Laptop constructor");
    }
}












