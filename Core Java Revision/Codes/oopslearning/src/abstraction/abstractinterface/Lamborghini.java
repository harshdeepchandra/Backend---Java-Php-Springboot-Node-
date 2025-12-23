package abstraction.abstractinterface;

public class Lamborghini implements Car {
    @Override
    public String startEngine() {
        return "Push start";
    }

    @Override
    public String applyBrake() {
        return "Disc brake";
    }
}
