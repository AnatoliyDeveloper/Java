package JavaStart.Lesson07.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Anatoliy on 23.09.2016.
 */
/*
Написать метод создания массива размера size, заполненного значениями от 0..(size-1).
Если size < 0, бросить исключение IllegalArgumentException.
int[] createSequenceArray(int size)
 */
public class SequenceArrayCreator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size = ");
        int size = sc.nextInt();
        sc.close();

        int array[] = createSequenceArray(size);
        System.out.println(Arrays.toString(array));

    }

    public static int[] createSequenceArray(int size) {
        if (size < 0){
            throw new IllegalArgumentException("The array size cannot be negative. Actual size = " + size);
        }

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        return array;
    }
}
