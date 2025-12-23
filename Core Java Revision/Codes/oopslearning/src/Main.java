public class Main {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();

        System.out.println(b1);
        System.out.println(b2);
        System.out.println("Both are same: " + (b1 == b2));

    }
}
