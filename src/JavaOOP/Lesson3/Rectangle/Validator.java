package JavaOOP.Lesson3.Rectangle;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Validator {

    public static void checkSize(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size should be positive, but " + size);
        }
    }
}
