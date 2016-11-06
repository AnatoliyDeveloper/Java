package JavaStart.Lesson08;

/**
 * Created by Anatoliy on 28.09.2016.
 */
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created on 29.04.2015
 *
 * @author Bohdan Vanchuhov
 */
public class DateSample {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println(date1.getTime());

        //--------------------------------------------------

        Date date2 = new Date(0L);
        System.out.println(date2);

        //--------------------------------------------------

        Date date3 = new Date(Long.MAX_VALUE);
        System.out.println(date3);

        //--------------------------------------------------
        GregorianCalendar gregorianCalendar = new GregorianCalendar(1812, 10, 30);
        Date dostoyevskyBirthDate = gregorianCalendar.getTime();
        System.out.println(dostoyevskyBirthDate);
        System.out.println(dostoyevskyBirthDate.getTime());
    }
}
