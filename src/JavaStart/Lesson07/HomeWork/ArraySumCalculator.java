package JavaStart.Lesson07.HomeWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Anatoliy on 23.09.2016.
 */
/*
Написать метод вычисления суммы всех элементов массива.
int sum(int[] array)
 */
public class ArraySumCalculator {

    public static void main(String[] args) {

        int [] array = {10, 20, 30};

        int sum = sum(array);
        System.out.println("sum = " + sum);
    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int elem : array){
            sum += elem;
        }
        return sum;
    }
}
