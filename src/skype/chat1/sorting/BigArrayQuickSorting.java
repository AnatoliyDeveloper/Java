package skype.chat1.sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Anatoliy on 06.11.2016.
 */
public class BigArrayQuickSorting {

    public static void main(String[] args) {
        int[] array = new int[100_000];

        fillRandom(array);
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void fillRandom(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
    }
}
