package JavaStart.Lesson08;

/**
 * Created by Anatoliy on 28.09.2016.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created on 29.04.2015
 *
 * @author Bohdan Vanchuhov
 */
public class SimpleDateFormatSample {
    public static void main(String[] args) {
        // Output
        SimpleDateFormat dateFormat = new SimpleDateFormat("'Today' d M yyyy");

        Date currentDate = new Date();
        String formatDate = dateFormat.format(currentDate);
        System.out.println(formatDate);

        System.out.println(dateFormat.format(new Date(0)));

        //--------------------------------------------------
        // Input
        try {
            Date summerDay = dateFormat.parse("Today 1 6 2016");
            System.out.println(summerDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
