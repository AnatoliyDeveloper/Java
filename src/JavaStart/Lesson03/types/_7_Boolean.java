package JavaStart.Lesson03.types;

/**
 * @author Bohdan Vanchuhov
 */
public class _7_Boolean {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(10 < 100);
        System.out.println("int == int: " + (1 == 1));
        System.out.println("int != int: " + (1 != 2));
        System.out.println("int == long: " + (1 == 1L));

        System.out.println("double == double: " + (0.3 == 0.3));

        double d1 = 0.3;
        double d2 = 0.1 + 0.2;
        System.out.println("d1 == d2: " + (d1 == d2));
        System.out.println("d1 == d2: " + (Math.abs(d1 - d2) < 1.e-5));
    }
}
