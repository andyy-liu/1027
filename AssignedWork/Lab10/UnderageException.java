public class UnderageException extends Exception {
    public UnderageException() {
        super("User must be 18 or older to access this feature");
    }

    public UnderageException(String message) {
        super(message);
    }
}