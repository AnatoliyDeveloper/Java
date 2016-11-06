package JavaOOP.Lesson1;

/**
 * Created by Anatoliy on 02.10.2016.
 */
public class StringMethodStoring {

    public static void main(String[] args) {
        String s = "Hello";
        s = addWorld(s);
        System.out.println(s);
    }

    private static String addWorld(String s) {
        s += " world";
        return s;
    }
}
