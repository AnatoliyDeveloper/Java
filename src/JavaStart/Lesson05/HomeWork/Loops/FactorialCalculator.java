package JavaStart.Lesson05.HomeWork.Loops;

import java.util.Scanner;

/**
 * Created by Anatoliy on 19.09.2016.
 */
/*
Определение факториала заданного числа n (1..20). Если число не соответствует
диапазону, бросить исключение IllegalArgumentException.
 */
public class FactorialCalculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter from 1 to 20: n = ");
        int n = in.nextInt();
        in.close();

        if (n <= 0 || n > 20) {
            throw new IllegalArgumentException("Factorial n must be in the range (1..20).\nActually n = " + n);
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
