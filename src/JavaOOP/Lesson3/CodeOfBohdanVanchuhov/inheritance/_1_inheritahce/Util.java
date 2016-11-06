package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._1_inheritahce;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Bohdan Vanchuhov
 */
public final class Util {
    private Util() {}

    public static Date cloneDate(Date date) {
        return date == null ? null : (Date) date.clone();
    }

    public static Date createDate(int day, int month, int year) {
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        return calendar.getTime();
    }
}
