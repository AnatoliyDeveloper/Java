package JavaStart.Lesson08.HomeWork.ConditionsLoops;

import java.util.Scanner;

/**
 * Created by Anatoliy on 25.09.2016.
 */
/*
Вывода в консоль всех простых чисел из заданного диапазона from..to.
Если аргументы from, to являются некорректными, бросить исключение
IllegalArgumentException.
void printPrimes(int from, int to)
 */
public class PrimesPrinter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter from = ");
        int from = sc.nextInt();
        System.out.print("Enter to = ");
        int to = sc.nextInt();
        sc.close();

        printPrimes(from, to);
    }

    public static void printPrimes(int from, int to) {
        validationFromTo(from, to);

        for (int i = from; i <= to; i++) {
            int x = 0;
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    x = 1;
                }
            }
            if (x == 0 && i >= 2) {
                System.out.print(i + " ");
            }
        }
    }

    public static void validationFromTo(int from, int to) {
        if (from >= to){
            throw new IllegalArgumentException("Please enter the correct values from and to: from < to. Actual values from = " + from + " and to = " + to);
        }
    }
}
