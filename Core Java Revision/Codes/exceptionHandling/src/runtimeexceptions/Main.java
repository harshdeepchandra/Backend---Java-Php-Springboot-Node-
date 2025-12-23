package runtimeexceptions;

public class Main {
    public static void main(String[] args) {
        //Runtime Exception

        System.out.println("Start of the program");


        try {
            System.out.println("Inside try block");
            //1. ArithmeticException
            int a = 10;
            int b = 0;
            System.out.println(a / b);
            System.out.println("After risky code");
        } catch(ArithmeticException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        } finally {
            System.out.println("This is finally block");
        }

        //2. NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch(NullPointerException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }

        //3. NumberFormatException
        try {
            String stringNumber = "12345abc";
            int num = Integer.parseInt(stringNumber);
            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }

        //4. IndexOutOfBoundsException
        //4.a ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[1];
            System.out.println(arr[1]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }

        //4.b StringIndexOutOfBoundsException
        try {
            String str2 = "Ducat";
            System.out.println(str2.charAt(5));
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }


        System.out.println("End of the program");
    }
}
