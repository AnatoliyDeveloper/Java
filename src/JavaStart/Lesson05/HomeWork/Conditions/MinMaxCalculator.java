package JavaStart.Lesson05.HomeWork.Conditions;

import java.util.Scanner;

/**
 * Created by Anatoliy on 18.09.2016.
 */
/*
Ќахождение минимума/максимума двух чисел.
 */
public class MinMaxCalculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter int a = ");
        int a = in.nextInt();
        System.out.print("Enter int b = ");
        int b = in.nextInt();
        in.close();

        int max = Math.max (a, b);
        int min = Math.min (a, b);

        System.out.println("max = " + max + ", " + "min = " + min);
    }
}
