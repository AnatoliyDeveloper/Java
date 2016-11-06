package JavaStart.Lesson08;

/**
 * Created by Anatoliy on 28.09.2016.
 */
public class NullSample {

    public static void main(String[] args) {
        String s = null;

        if (s != null) {
            int length = s.length();
            System.out.println(length);
        }
    }
}
