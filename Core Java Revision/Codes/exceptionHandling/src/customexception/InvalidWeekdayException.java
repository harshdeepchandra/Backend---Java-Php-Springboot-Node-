package customexception;

// Checked Exception
public class InvalidWeekdayException extends Exception {
    public InvalidWeekdayException() {
        super();
    }

    public InvalidWeekdayException(String m) {
        super(m);
    }
}
