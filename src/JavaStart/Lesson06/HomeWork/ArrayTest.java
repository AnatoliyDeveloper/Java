package JavaStart.Lesson06.HomeWork;

import java.util.Arrays;

/**
 * Created by Anatoliy on 21.09.2016.
 */
public class ArrayTest {

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        System.out.println(Arrays.toString(a));
        int[] b = a;
        b[0] = 100;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
