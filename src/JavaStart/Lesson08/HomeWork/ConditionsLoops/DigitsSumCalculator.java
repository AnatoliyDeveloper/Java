package JavaStart.Lesson08.HomeWork.ConditionsLoops;

import java.util.Scanner;

/**
 * Created by Anatoliy on 25.09.2016.
 */
/*
Вычисление суммы всех цифр чисел из заданного диапазона from..to.
Если аргументы from, to являются некорректными, бросить исключение
IllegalArgumentException.
int digitsSum(int from, int to)
 */
public class DigitsSumCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter from = ");
        int from = sc.nextInt();
        System.out.print("Enter to = ");
        int to = sc.nextInt();
        sc.close();

        int res = digitsSum(from, to);

        System.out.println(res);
    }

    public static int digitsSum(int from, int to){
        validationFromTo(from, to);

        int sum = 0;
        int module = 0;
        int result = 0;
        if (from == to) {
            while (from > 0) {
                sum += from % 10;
                from /= 10;
            }
            if (sum < 0) {
                module = Math.abs(sum);
                return result = module;
            } else return result = sum;
        }

        else if ( from < to) {
            while (from <= to) {
                sum += from;
                from++;
            }

            if (sum < 0) {
                module = Math.abs(sum);
                return result = module;
            } else return result = sum;
        }
        return result;
    }

    public static void validationFromTo(int from, int to) {
        if (from > to){
            throw new IllegalArgumentException("Please enter the correct values from and to: from < to. Actual values from = " + from + " and to = " + to);
        }
    }
}
