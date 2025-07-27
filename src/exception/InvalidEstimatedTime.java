package exception;

public class InvalidEstimatedTime extends RuntimeException {
    public InvalidEstimatedTime(String message) {
        super(message);
    }
}
