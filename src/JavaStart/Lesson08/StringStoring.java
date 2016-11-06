package JavaStart.Lesson08;

/**
 * Created by Anatoliy on 28.09.2016.
 */
public class StringStoring {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        System.out.println("ref: " + (s1 == s2));
        System.out.println("content: " + s1.equals(s2));
    }
}
