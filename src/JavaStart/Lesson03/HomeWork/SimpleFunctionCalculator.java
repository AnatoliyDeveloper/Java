package JavaStart.Lesson03.HomeWork;

import java.util.Scanner;

/**
 * Created by Anatoliy on 12.09.2016.
 */
public class SimpleFunctionCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");

        double x = scanner.nextDouble();

        double fx = Math.log( Math.sin(x) + Math.pow(Math.E, x) * ( Math.sqrt(x) / Math.PI));

        System.out.println("f(x) = " + fx);

        scanner.close();

    }

}
