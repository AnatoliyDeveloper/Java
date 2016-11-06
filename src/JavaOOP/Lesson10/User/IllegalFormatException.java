package JavaOOP.Lesson10.User;

/**
 * Created by Anatoliy on 05.11.2016.
 */
public class IllegalFormatException extends RuntimeException {

    public IllegalFormatException(String message) {
        super(message);
    }

    public IllegalFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
