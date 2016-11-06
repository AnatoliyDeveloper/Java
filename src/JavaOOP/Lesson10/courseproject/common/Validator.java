package JavaOOP.Lesson10.courseproject.common;

/**
 * Created by Anatoliy on 05.11.2016.
 */
public final class Validator {

    private Validator() {
    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
