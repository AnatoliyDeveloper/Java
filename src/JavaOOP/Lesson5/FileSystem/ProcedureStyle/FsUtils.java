package JavaOOP.Lesson5.FileSystem.ProcedureStyle;

/**
 * Created by Anatoliy on 15.10.2016.
 */
public class FsUtils {

    public static int notNegative(final int n, final String name) {
        if (n < 0) {
            throw new IllegalArgumentException(name + " may not be negative");
        }
        return n;
    }

    public static <T> T notNull(final T argument, final String name) {
        if (argument == null) {
            throw new IllegalArgumentException(name + " may not be null");
        }
        return argument;
    }
}
