package testfinal;

public class Main extends A {
    public static void main(String[] args) {
        final int a = 10;
        System.out.println(a);

        Main mainObj = new Main();
        System.out.println(mainObj.something());
    }

    @Override
    public String something() {
        return "Something from child";
    }
}
