package runtimeexceptions;

public class Test {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } finally {
                System.out.println("I'm finally block");
            }
        } catch(ArithmeticException e) {
            System.out.println("An exception occurred2: " + e.getMessage());
        }
    }
}
