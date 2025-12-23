package polymorphism.methodoverloading;

public class Main {
    public static void main(String[] args) {
        Main mainObj = new Main();

        mainObj.printMyName("Abhishek");
    }

    public void printMyName() {
        System.out.println("I don't have any name");
    }

    public void printMyName(String name) {
        System.out.println("My name is " + name);
    }
}
