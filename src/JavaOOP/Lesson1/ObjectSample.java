package JavaOOP.Lesson1;

/**
 * Created by Anatoliy on 02.10.2016.
 */
public class ObjectSample {

    public static void main(String[] args) {
        String s = "Hello";

        int length = s.length();
        System.out.println(length);

        String reversedString = reverse(s);
        System.out.println(reversedString);
    }

    private static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
