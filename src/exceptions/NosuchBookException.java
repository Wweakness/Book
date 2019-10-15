package exceptions;

public class NosuchBookException extends Exception {
    public NosuchBookException() {
    }

    public NosuchBookException(String message) {
        super(message);
    }

    public NosuchBookException(String message, Throwable cause) {
        super(message, cause);
    }

    public NosuchBookException(Throwable cause) {
        super(cause);
    }

    public NosuchBookException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
