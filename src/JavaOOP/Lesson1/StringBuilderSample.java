package JavaOOP.Lesson1;

/**
 * Created by Anatoliy on 02.10.2016.
 */
public class StringBuilderSample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello,").append("world").append("!");
        String s = sb.toString();

        System.out.println(s);
    }
}
