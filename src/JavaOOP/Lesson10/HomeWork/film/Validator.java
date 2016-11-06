package JavaOOP.Lesson10.HomeWork.film;

/**
 * Created by Anatoliy on 06.11.2016.
 */
public class Validator {

    public static boolean isYearRelease (int year){
        return year >= 1880 && year <= 2030;
    }

    public static boolean isInt (String s){
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
