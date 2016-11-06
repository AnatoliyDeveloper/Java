package JavaStart.Lesson08;

/**
 * Created by Anatoliy on 28.09.2016.
 */
public class IntMethodStoring {

    public static void main(String[] args) {
        int x = 10;
        x = inc(x);
        System.out.println("x = " + x); //
    }

    private static int inc(int x) {
        return x + 1;
    }
}
