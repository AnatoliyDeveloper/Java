package JavaStart.Lesson05.HomeWork.Loops;

import java.util.Scanner;

/**
 * Created by Anatoliy on 19.09.2016.
 */
/*
Вывод на экран набора целых чисел от first до last.
 */
public class RangePrinter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first = ");
        int first = in.nextInt();
        System.out.print("Enter last = ");
        int last = in.nextInt();
        in.close();

        if (first <= last) {
            for (int i = first; i <= last; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = first; i >= last; i--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
