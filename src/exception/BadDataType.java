package exception;

public class BadDataType extends RuntimeException{
    public BadDataType() {
    }

    public BadDataType(String message) {
        super(message);
    }

    public BadDataType(String message, Throwable cause) {
        super(message, cause);
    }

    public BadDataType(Throwable cause) {
        super(cause);
    }
}
