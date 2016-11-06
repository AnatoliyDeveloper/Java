package ua.kiev.prog.javaoop.exceptions.basics;

/**
 * @author Bohdan Vanchuhov
 */
public class FactorialCalculator {
    public static void main(String[] args) {
        int factorial = factorial(-10);
        System.out.println(factorial);
    }

    public static int factorial(int n) {
        checkFactorialArg(n);

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static void checkFactorialArg(int n) {
        if (n < 0) {
            throw new NegativeIntException();
        }
    }
}
