package skype.chat2.date;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Anatoliy on 06.11.2016.
 */
public class DateSample {

    public static void main(String[] args) {
        long currentTimestamp = System.currentTimeMillis();
        System.out.println("currentTimestamp = " + currentTimestamp);

        Date currentDate = new Date(currentTimestamp);
        System.out.println("currentDate = " + currentDate);

        GregorianCalendar calendar = new GregorianCalendar(1960, 0, 15);
        Date birthDate = calendar.getTime();
        long birthTimestamp = birthDate.getTime();
        System.out.println("birthTimestamp = " + birthTimestamp);

        System.out.println("beginOfTime = " + new Date(0L));
        System.out.println("endOfTime = " + new Date(Long.MAX_VALUE));
    }
}
