package JavaStart.Lesson08.HomeWork.ConditionsLoops;

import java.util.Scanner;

/**
 * Created by Anatoliy on 25.09.2016.
 */
/*
Вывод в консоль цифр целого числа. Если число отрицательное, вывести знак «-».
Использование преобразования числа в строку запрещено.
void outputDigits(int n)
 */
public class DigitsPrinter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n = in.nextInt();
        in.close();

        outputDigits(n);
    }

    static void outputDigits(int n) {
        int a;
        int abs = Math.abs(n);
        int log = (int) Math.log10(abs) + 1;
        if (n < 0) {
            System.out.print("- ");
        }
        for (int i = log; i >= 1; i--) {
            a = (int) (abs / Math.pow(10, i - 1));
            System.out.print(a + " ");
            abs -= (int) (a * Math.pow(10, i - 1));
        }
    }
}
