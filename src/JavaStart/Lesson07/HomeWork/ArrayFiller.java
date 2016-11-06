package JavaStart.Lesson07.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Anatoliy on 23.09.2016.
 */
/*
Написать метод заполнения массива array указанным значением filler.
void fill(int[] array, int filler)
 */
public class ArrayFiller {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter size = ");
        int size = in.nextInt();
        in.close();

        int [] array = new int[size];
        fill(array, 777);
        System.out.println(Arrays.toString(array));
    }

    private static void fill(int[] array, int filler) {

        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
    }
}
