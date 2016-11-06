package JavaStart.Lesson04.HomeWork;

import java.util.Scanner;

/**
 * Created by Anatoliy on 17.09.2016.
 */
public class LoopsFromTo {

    public static void main(String[] args) {

        //Вывести все числа от from до to. from <= to.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter from = ");
        int from = in.nextInt();

        System.out.print("Enter to = ");
        int to = in.nextInt();

        in.close();

        for (int i = from; i <= to; i++){
            System.out.print(i + " ");
        }

        System.out.println(" ");
    }
}
