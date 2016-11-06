package JavaOOP.Lesson10.User;

/**
 * Created by Anatoliy on 05.11.2016.
 */
public final class Validator {

    private Validator() {}

    public static boolean isAge(int age) {
        return age >= 1 && age <= 120;
    }

    public static boolean isLong(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
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
