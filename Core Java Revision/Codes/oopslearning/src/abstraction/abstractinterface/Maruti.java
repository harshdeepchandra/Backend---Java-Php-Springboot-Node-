package abstraction.abstractinterface;

public class Maruti implements Car {

    @Override
    public String startEngine() {
        return "Manual start";
    }

    @Override
    public String applyBrake() {
        return "Drum brake";
    }
}
