package JavaStart.Lesson04;

import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by Anatoliy on 16.09.2016.
 */
public class SimpleFunctionCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X: ");
        double x = scanner.nextDouble();
        scanner.close();

        double res = log(sin(x) + ((pow(E, x) * sqrt(x)) / PI));

        System.out.println("f(x) = " + res);
    }

}
