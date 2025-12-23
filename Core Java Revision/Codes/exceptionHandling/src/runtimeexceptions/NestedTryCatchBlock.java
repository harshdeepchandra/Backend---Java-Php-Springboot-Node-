package runtimeexceptions;

public class NestedTryCatchBlock {
    public static void main(String[] args) {

        try {
            System.out.println(10/10);
            try {
                String str = null;
                int len = str.length();
                System.out.println(len);
            } catch(NullPointerException e) {
                System.out.println("An exception occurred1: " + e.getMessage());
            }

        } catch(ArithmeticException e) {
            try {
                int n = Integer.parseInt("123");
            } catch(NumberFormatException ex) {
                System.out.println("An exception occurred2: " + ex.getMessage());
            }
        }

    }
}
