package JavaStart.Lesson04;

/**
 * Calculates factorial of the specified number n, that in the range [0..20]
 *
 * @author bvanchuhov
 * @see <a href="https://en.wikipedia.org/wiki/Factorial">https://en.wikipedia.org/wiki/Factorial</a>
 */
public class FactorialCalculator {

    public static void main(String[] args) {
        // Input
        int n = 10; // Test with n = -1, 0, 1, 3, 20

        // Input validation
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("factorial arg must be in the range [0..20], but actually is " + n);
        }

        // Business Logic
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Output
        System.out.println(factorial);
    }
}