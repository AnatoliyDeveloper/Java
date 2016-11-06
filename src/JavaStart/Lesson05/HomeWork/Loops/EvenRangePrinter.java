package JavaStart.Lesson05.HomeWork.Loops;

import java.util.Scanner;

/**
 * Created by Anatoliy on 19.09.2016.
 */
/*
Вывод на экран набор чётных чисел от first до last. Если first > last, ничего не выводить.
 */
public class EvenRangePrinter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first = ");
        int first = in.nextInt();
        System.out.print("Enter last = ");
        int last = in.nextInt();
        in.close();

        if (first % 2 != 0) {
            first++;
        }

        if (first <= last) {
            for (int i = first; i <= last; i+=2){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
