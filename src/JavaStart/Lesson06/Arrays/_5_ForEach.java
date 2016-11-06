package JavaStart.Lesson06.Arrays;

import java.util.Arrays;

/**
 * @author Bohdan Vanchuhov
 */
public class _5_ForEach {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};

        for (int i = 0; i < a.length; i++) {
            int elem = a[i];
            System.out.println(elem);
        }
        System.out.println();

        //--------------------------------------------------

        // for-each
        // READ-ONLY
        for (int elem : a) {
            System.out.println(elem);
        }

        //--------------------------------------------------

        int[] b = new int[SIZE];
        for (int elem : b) {
            elem = 1;
        }
        System.out.println(Arrays.toString(b));
    }
}
