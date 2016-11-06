package JavaOOP.Lesson6.ExceptionsAndEnumeration.Factorial;

import java.math.BigInteger;

import static JavaOOP.Lesson6.ExceptionsAndEnumeration.Factorial.Factorial.factorial;

/**
 * Created by Anatoliy on 19.10.2016.
 */
public class FactorialRunner {

    public static void main(String[] args) {
        BigInteger factorial = factorial(100_000);
        System.out.println(factorial);
        System.out.println("Bye");
    }
}
