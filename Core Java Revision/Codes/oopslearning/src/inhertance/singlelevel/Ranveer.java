package inhertance.singlelevel;

public class Ranveer extends Rishi {
    public String firstName = "Ranveer";

    public String printMyName() {
        return "My name is " + firstName + " " + lastName;
    }

    public String printMyParentName() {
        return "My parent name is " + super.firstName + " " + lastName;
    }
}
