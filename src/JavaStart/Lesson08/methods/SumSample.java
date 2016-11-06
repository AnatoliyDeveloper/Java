package JavaStart.Lesson08.methods;

/**
 * Created on 19.05.2015
 *
 * @author Bohdan Vanchuhov
 */
public class SumSample {
    public static void main(String[] args) {
        System.out.println(sum(2, 3));

        System.out.println(sum(2, 3, 4));

        System.out.println(sum("Hello", " world"));
    }

    public static String sum(String a, String b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return sum(sum(a, b), c);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
