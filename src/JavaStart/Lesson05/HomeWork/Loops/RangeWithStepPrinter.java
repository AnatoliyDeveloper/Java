package JavaStart.Lesson05.HomeWork.Loops;

import java.util.Scanner;

/**
 * Created by Anatoliy on 19.09.2016.
 */
/*
Вывод на экран набор целых чисел от first до last c шагом step. Если вывод может
привести к зацикливанию, бросить исключение IllegalArgumentException.
 */
public class RangeWithStepPrinter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first = ");
        int first = in.nextInt();
        System.out.print("Enter last = ");
        int last = in.nextInt();
        System.out.print("Enter step = ");
        int step = in.nextInt();
        in.close();

        if (first <= last && step > 0) {
            for (int i = first; i <= last; i+=step){
                System.out.print(i + " ");
            }
            System.out.println();
        } else if (first >= last && step < 0) {
            for (int i = first; i >= last; i+=step){
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            throw new IllegalArgumentException("You entered step leads to a circularity, or you entered zero.\nPlease change step loop. The actual step " + step);
        }
    }
}
