package runtimeexceptions;

public class TestStackOverFlowError {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        try {
            printHello();
        } catch(Throwable th) {
            System.out.println("An exception occurred: " + th.getMessage());
        }

        System.out.println("End of the program");
    }

    public static void printHello() {
        System.out.println("Hello");
        printHello();
    }
}
