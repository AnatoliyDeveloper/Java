package JavaOOP.Lesson10.HomeWork.film;

/**
 * Created by Anatoliy on 06.11.2016.
 */
public class IllegalFormatException extends RuntimeException {

    public IllegalFormatException(String message) {
        super(message);
    }

    public IllegalFormatException(Throwable cause) {
        super(cause);
    }

    public IllegalFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
