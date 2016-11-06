package ua.kiev.prog.javaoop.exceptions.basics;

/**
 * @author Bohdan Vanchuhov
 */
public class NegativeIntException extends RuntimeException {
    public NegativeIntException() {}
    public NegativeIntException(String message) {
        super(message);
    }

    public NegativeIntException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }
}
