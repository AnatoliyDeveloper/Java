package JavaOOP.Lesson3.Composition;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class WorkPlatformRunner {

    public static void main(String[] args) {
        User user = new User("Constantin", getTime(20, 1, 1980));
        CV cv = new CV(user, 2000);

        user.setCv(cv);

        System.out.println("user = " + user);
        System.out.println("cv = " + cv);
    }

    private static long getTime(int dayOfMonth, int month, int year) {
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, dayOfMonth);
        Date birthDate = calendar.getTime();

        return birthDate.getTime();
    }
}
