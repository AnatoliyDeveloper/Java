package JavaStart.Lesson08;

import java.util.Arrays;

/**
 * Created by Anatoliy on 28.09.2016.
 */
public class ArrayMethodStoring {

    public static void main(String[] args) {
        int[] a = new int[10];

        Arrays.fill(a, 1);

        System.out.println("a = " + Arrays.toString(a));
    }
}
