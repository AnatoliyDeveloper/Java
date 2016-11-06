package JavaOOP.Lesson3.Student;

import java.util.GregorianCalendar;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public final class DateUtils {

    private DateUtils() {
    }

    public static long getTimestamp(int dayOfMoth, int month, int year) {
        return new GregorianCalendar(year, month - 1, dayOfMoth).getTime().getTime();
    }
}
