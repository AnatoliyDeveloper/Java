package JavaStart.Lesson06.Arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Bohdan Vanchuhov
 */
public class _6_Practice {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] array = new int[SIZE];

        randomFillArray(array, 0, 100);
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int sum = findSum(array);
        System.out.println(sum);
    }

    private static int findSum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }

        return sum;
    }

    private static void randomFillArray(int[] array, int min, int max) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomNumber = min + random.nextInt(max - min + 1);
            array[i] = randomNumber;
        }
    }
}
