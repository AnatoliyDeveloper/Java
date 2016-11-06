package skype.chat1.sorting;

import java.util.Arrays;

/**
 * Created by Anatoliy on 06.11.2016.
 */
public class BubbleSortingWithDebugInfo {

    public static void main(String[] args) {
        System.out.println("---- Exchange Sort Raising ----");
        exchangeSortRaising(createTestArray());

        System.out.println("---- Exchange Sort Sinking ----");
        exchangeSortSinking(createTestArray());

        System.out.println("---- Exchange Sort Raising With Flag ----");
        exchangeSortRaisingWithFlag(createTestArray());
    }

    private static int[] createTestArray() {
        return new int[]{1, 2, 4, 3};
    }

    public static void exchangeSortRaising(int[] array) {
        for (int upperBound = array.length - 1; upperBound >= 1; upperBound--) {
            System.out.println("upperBound = " + upperBound);

            for (int i = 1; i <= upperBound; i++) {
                System.out.print("(" + (i - 1) + ", " + (i) + ") : " + Arrays.toString(array) + " -> ");

                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                }

                System.out.println(Arrays.toString(array));
            }

            System.out.println();
        }
    }

    public static void exchangeSortSinking(int[] array) {
        for (int lowerBound = 1; lowerBound < array.length; lowerBound++) {
            System.out.println("lowerBound = " + lowerBound);

            for (int i = array.length - 1; i >= lowerBound; i--) {
                System.out.print("(" + (i - 1) + ", " + (i) + ") : " + Arrays.toString(array) + " -> ");

                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                }

                System.out.println(Arrays.toString(array));
            }

            System.out.println();
        }
    }

    public static void exchangeSortRaisingWithFlag(int[] array) {
        boolean isChanged = true;

        for (int upperBound = array.length - 1; upperBound >= 1 && isChanged; upperBound--) {
            System.out.println("upperBound = " + upperBound);

            isChanged = false;
            for (int i = 1; i <= upperBound; i++) {
                System.out.print("(" + (i - 1) + ", " + (i) + ") : " + Arrays.toString(array) + " -> ");

                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                    isChanged = true;
                }

                System.out.println(Arrays.toString(array));
            }

            System.out.println("isChanged = " + isChanged);
            System.out.println();
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
