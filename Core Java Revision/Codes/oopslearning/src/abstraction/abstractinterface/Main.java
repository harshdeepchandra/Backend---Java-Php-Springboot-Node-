package abstraction.abstractinterface;

public class Main {
    public static void main(String[] args) {
        Car car = new Lamborghini();

        System.out.println(car.startEngine());
        System.out.println(car.applyBrake());
    }
}
