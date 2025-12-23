package abstraction.abstractclass;

public abstract class Car {

    // Non-abstract method
    public String printMyClassName() {
        return "It's a Car class";
    }

    // Abstract method
    public abstract String applyBrake();

    // Abstract method
    public abstract String startEngine();
}
