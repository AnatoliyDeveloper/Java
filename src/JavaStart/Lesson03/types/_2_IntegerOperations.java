package JavaStart.Lesson03.types;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_IntegerOperations {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println();

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
