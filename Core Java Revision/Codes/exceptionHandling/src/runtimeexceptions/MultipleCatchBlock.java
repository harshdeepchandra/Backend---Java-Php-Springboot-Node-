package runtimeexceptions;

public class MultipleCatchBlock {
    public static void main(String[] args) {

        try {
            int[] arr = {1};
            System.out.println(arr[0]);

            System.out.println(10 / 10);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("An AIOOBE occurred");
        } catch(ArithmeticException e) {
            System.out.println("An Arithmetic exception occurred");
        }
    }
}
