package JavaOOP.Lesson1;

import java.util.Objects;

/**
 * Created by Anatoliy on 02.10.2016.
 */
public class StringStoring {

    public static void main(String[] args) {
        String s1 = null;
        String s2 = new String("Hello");

        System.out.println("ref: " + (s1 == s2));
        System.out.println("content: " + Objects.equals(s1, s2));
    }
}
