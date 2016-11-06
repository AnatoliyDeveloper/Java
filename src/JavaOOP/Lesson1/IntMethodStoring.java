package JavaOOP.Lesson1;

/**
 * Created by Anatoliy on 02.10.2016.
 */
public class IntMethodStoring {

    public static void main(String[] args) {
        int x = 100;
        x = inc(x);
        System.out.println("x = " + x);
    }

    private static int inc(int x) {
        return x + 1;
    }
}
