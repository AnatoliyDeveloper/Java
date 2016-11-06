package JavaStart.Lesson03.HomeWork;

import java.util.Scanner;

/**
 * Created by Anatoliy on 12.09.2016.
 */
public class AverageCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int ave = ( a / 2 + b / 2 ) + ( a % 2 + b % 2 ) / 2;

        System.out.println("Average = " + ave);

        sc.close();
    }

}
