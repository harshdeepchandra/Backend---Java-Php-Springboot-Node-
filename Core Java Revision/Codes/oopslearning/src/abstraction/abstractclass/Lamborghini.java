package abstraction.abstractclass;

public class Lamborghini extends Car {
    @Override
    public String applyBrake() {
        return "Applying disc brake";
    }

    @Override
    public String startEngine() {
        return "Automatically starting the engine";
    }
}
