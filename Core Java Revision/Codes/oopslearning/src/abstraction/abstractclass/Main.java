package abstraction.abstractclass;

public class Main {
    public static void main(String[] args) {
        Car car = new Lamborghini();

        System.out.println(car.printMyClassName());
        System.out.println(car.startEngine());
        System.out.println(car.applyBrake());

        // System.out.println(car.marutiMethod());

    }
}
