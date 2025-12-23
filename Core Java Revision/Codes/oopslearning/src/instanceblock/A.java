package instanceblock;

public class A {

    {
        System.out.println("Inside instance block");
//        new A();
    }

    public A() {
        System.out.println("Inside constructor");
    }
}
