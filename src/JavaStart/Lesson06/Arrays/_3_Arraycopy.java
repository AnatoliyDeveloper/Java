package JavaStart.Lesson06.Arrays;

import java.util.Arrays;

/**
 * @author Bohdan Vanchuhov
 */
public class _3_Arraycopy {
    public static final int SIZE = 5;

    public static void main(String[] args) {
        int[] a1 = {0, 1, 2, 3, 4};

        int[] a2 = new int[SIZE];
        System.arraycopy(a1, 0, a2, 0, 3);
        System.out.println(Arrays.toString(a2));

        a2 = new int[SIZE];
        System.arraycopy(a1, 2, a2, 0, 3);
        System.out.println(Arrays.toString(a2));

        a2 = new int[SIZE];
        System.arraycopy(a1, 2, a2, 3, 3);
        System.out.println(Arrays.toString(a2));
    }
}
