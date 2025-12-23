package abstraction.abstractclass;

public class Maruti extends Car {

    @Override
    public String applyBrake() {
        return "Applying drum brake";
    }

    @Override
    public String startEngine() {
        return "Manually starting engine";
    }

    public String marutiMethod() {
        return "I'm Maruti";
    }
}
