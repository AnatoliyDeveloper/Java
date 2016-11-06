package JavaStart.Lesson04;

/**
 * Created by Anatoliy on 16.09.2016.
 */
/**
 * @author bvanchuhov
 */
public class FactorialCalculatorWithMethods {

    public static void main(String[] args) {
        System.out.println("factorial(0) = " + factorial(0));
        System.out.println("factorial(1) = " + factorial(1));
        System.out.println("factorial(3) = " + factorial(3));
        System.out.println("factorial(5) = " + factorial(5));
    }

    /**
     * Calculates factorial of the specified number n, that in the range [0..20]
     *
     * @param n the specified number n
     * @return the factorial of the specified number
     * @see <a href="https://en.wikipedia.org/wiki/Factorial">https://en.wikipedia.org/wiki/Factorial</a>
     */
    public static long factorial(int n) {
        checkFactorialArg(n);

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    private static void checkFactorialArg(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("factorial arg must be in the range [0..20], but actually is " + n);
        }
    }
}
