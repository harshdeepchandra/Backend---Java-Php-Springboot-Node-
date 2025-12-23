package customexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main mainObj = new Main();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter weekday no.");
        int n = scan.nextInt();

        try {
            System.out.println(mainObj.getWeekdayName(n));
        } catch(InvalidWeekdayException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }

        System.out.println("Enter your age");
        int age = scan.nextInt();

        try {
            System.out.println(mainObj.castYourVote(age));
        } catch(InvalidAgeException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }

        System.out.println("End of the program");
    }

    public String getWeekdayName(int n) throws InvalidWeekdayException {
        if(n < 1 || n > 7) {
            throw new InvalidWeekdayException("Invalid weekday no");
        } else {
            switch(n) {
                case 1: return "Monday";
                case 2: return "Tuesday";
                case 3: return "Wednesday";
                case 4: return "Thursday";
                case 5: return "Friday";
                case 6: return "Saturday";
                case 7: return "Sunday";
            }
        }

        return null;
    }

    public String castYourVote(int age) {
        if(age >= 18) {
            return "You can cast your vote";
        } else if(age >= 0) {
            return "You can't cast your vote";
        } else {
            throw new InvalidAgeException("Age can not be negative");
        }
    }
}
