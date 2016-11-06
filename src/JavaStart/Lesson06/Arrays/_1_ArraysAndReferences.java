package JavaStart.Lesson06.Arrays;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_ArraysAndReferences {
    public static void main(String[] args) {
        int[] a1; // Good
        int [] a2;
        int a3[];
        int a4 [];

        int intArray[], var;
        float[] floatArray1, floatArray2;

        int[] a5 = new int[10];
        String[] strings = new String[7];

        int[] a6 = {5, 7, 9, -5, 6, -2};
        a6 = new int[]{5, 7, 9, -5, 6, -2, 3, (byte)1};

        byte[] byteArray = {1, 3, 5};

        intArray = a5;

//        intArray = byteArray;
//        intArray = (int[]) byteArray;
    }
}
