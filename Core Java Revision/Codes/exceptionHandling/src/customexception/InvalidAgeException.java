package customexception;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        super();
    }

    public InvalidAgeException(String m) {
        super(m);
    }
}
