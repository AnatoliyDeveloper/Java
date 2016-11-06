package JavaOOP.Lesson1;

/**
 * Created by Anatoliy on 02.10.2016.
 */
public class StringBuilderStoring {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        addWorld(sb);
        System.out.println(sb);
    }

    private static void addWorld(StringBuilder sb) {
        sb.append(", world");
    }
}
