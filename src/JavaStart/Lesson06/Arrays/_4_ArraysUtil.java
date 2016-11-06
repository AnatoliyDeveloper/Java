package JavaStart.Lesson06.Arrays;

import java.util.Arrays;

/**
 * @author Bohdan Vanchuhov
 */
public class _4_ArraysUtil {
    public static final int SIZE = 10;

    public static void main(String[] args) {
        int[] a1 = new int[SIZE];
        Arrays.fill(a1, 1);
        System.out.println(Arrays.toString(a1));

        a1 = new int[]{4, -1, 5, 3};
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));

        int[] x = {1, 2, 3, 4};
        int[] y = {1, 2, 3, 4};
        int[] z = {5, 6, 7};
        System.out.println(x == y);
        System.out.println(Arrays.equals(x, y));
        System.out.println(Arrays.equals(x, z));

        a1 = new int[]{1, 20, 30, 35, 60, 100};
        int n = Arrays.binarySearch(a1, 35);
        System.out.println(n);
    }
}
