package JavaStart.Lesson06.Arrays;

import java.util.Arrays;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_ArrayAccess {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        System.out.println("Second element: " + a1[1]);
        System.out.println("Third element: " + a1[2]);

        System.out.println(a1);
        System.out.println(Arrays.toString(a1)); // Good

        a1[2] = 10;
        System.out.println("a1: " + Arrays.toString(a1));

        int[] a2 = a1;
        a2[2] = 10_000;
        System.out.println("a1: " + Arrays.toString(a1));

        int[] a3 = Arrays.copyOf(a1, a1.length);
        a3[2] = 123;
        System.out.println("a3: " + Arrays.toString(a3));
        System.out.println("a1: " + Arrays.toString(a1));

//        int[] a = new int[-1];
//        a[10] = 10;
    }
}
