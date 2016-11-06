package JavaOOP.Lesson6.ExceptionsAndEnumeration.Factorial;

import java.math.BigInteger;

/**
 * Created by Anatoliy on 19.10.2016.
 */
public class Factorial {

    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("negative arg: " + n);
        }

        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
