package JavaStart.Lesson08.HomeWork.ConditionsLoops;

import java.util.Scanner;

/**
 * Created by Anatoliy on 25.09.2016.
 */
/*
Вывод в консоль неотрицательного целого числа в системе счисления radix (2..10).
Если число отрицательное или система счисления не соответствует диапазону,
бросить исключение IllegalArgumentException.
Использование библиотечных методов запрещено.
void printInRadix(int n, int radix)
 */
public class RadixPrinter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n = in.nextInt();
        System.out.print("Enter radix (2-10) = ");
        int radix = in.nextInt();
        in.close();

        printInRadix(n, radix);
    }

    public static void checkingInputData(int n, int radix) {
        if (n < 0)
        {
            throw new IllegalArgumentException("Please enter a non-negative number. Actually number = " + n);
        }
        if (radix < 2 || radix > 10)
        {
            throw new IllegalArgumentException("Please enter radix from 2 to 10. Actually radix = " + radix);
        }
    }

    static void printInRadix(int n, int radix) {
        checkingInputData(n, radix);

        int pow = 0;
        int res = 0;
        System.out.print("Calculation of numbers in the radix " + radix + " = ");
        while (n >= (int) Math.pow(radix, pow)) {
            pow++;
        }

        for (int i = pow - 1; i >= 0; i--) {
            res = n / (int) Math.pow(radix, i);
            n = n - res * (int) Math.pow(radix, i);
            System.out.print(res);
        }
    }
}
