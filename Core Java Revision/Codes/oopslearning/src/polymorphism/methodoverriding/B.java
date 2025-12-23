package polymorphism.methodoverriding;

public class B extends A {
    @Override
    public void printMyName() {
        System.out.println("I'm a sub/child class");
    }
}
