package staticblock;

public class Main {
    static {
        System.out.println("Inside static block");
    }
    private static int count = 0;
    public Main() {
        System.out.println("Inside constructor");
    }
    public static void main(String[] args) {
        System.out.println("Inside psvm");
        Main mainObj = new Main();
        random();
    }
    public static void random() {
        System.out.println("Inside random method");
        if(count>=2) {
            return;
        }
        count++;
        main(new String[]{});
    }
}
