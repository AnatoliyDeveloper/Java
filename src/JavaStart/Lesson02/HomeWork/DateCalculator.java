package JavaStart.Lesson02.HomeWork;

/**
 * Created by Anatoliy on 10.09.2016.
 */
public class DateCalculator {

    public static void main(String[] args) {
        int days = 10000;

        int year = ( days / 360 );
        int month = ( days - ( year * 360 )) / 30;
        int day = ( days - ( month * 30 ) - ( year * 360 ));

        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);

    }

}
