package checkedandunchecked;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main obj = new Main();
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number");
        int a = scan.nextInt();

        System.out.println("enter b number");
        int b = scan.nextInt();

        // Unchecked exception
        System.out.println(a/b);

        try {
            throw new RuntimeException("Test exception");
        } catch(RuntimeException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }


        obj.delayForFiveSeconds();


        System.out.println("End of the program");
    }

    public void delayForFiveSeconds() throws InterruptedException {
        Thread.sleep(5000);
    }
}
