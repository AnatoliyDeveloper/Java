package ua.kiev.prog.javaoop.exceptions.finally_sample;

/**
 * @author Bohdan Vanchuhov
 */
public class FinallySample {
    public static void main(String[] args) {
        m1();
        m2();

        System.out.println(f2());
    }

    private static void m1() {
        try {
            int x = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("In Catch");
        } finally {
            System.out.println("In Finally");
        }
    }

    private static void m2() {
        try {
            int x = 1 / 0;
        } catch (ArithmeticException e) {
            System.out.println("In Catch");
            throw new RuntimeException();
        } finally {
            System.out.println("In Finally");
        }
    }

    private static int f2() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }
}
