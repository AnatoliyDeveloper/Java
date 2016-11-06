package JavaStart.Lesson03.types;

/**
 * @author Bohdan Vanchuhov
 */
public class _5_FloatOperations {
    public static void main(String[] args) {
        double x = 10.;
        double y = 3.;

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
        System.out.println();

        System.out.println("x++ = " + (x++));
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x));
        System.out.println();

        System.out.println("y-- = " + (y--));
        System.out.println("y = " + y);
        System.out.println("--y = " + (--y));
    }
}
