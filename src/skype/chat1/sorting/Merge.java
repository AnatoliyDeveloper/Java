package skype.chat1.sorting;

import java.util.Arrays;

/**
 * Created by Anatoliy on 06.11.2016.
 */
public class Merge {

    public static void main(String[] args) {
        int[] a = {1, 5, 7, 8};
        int[] b = {2, 4, 5, 6, 9, 10, 11};
        int[] res = merge(a, b);
        System.out.println("res = " + Arrays.toString(res));

        int[] expected = {1, 2, 4, 5, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(Arrays.equals(res, expected));
    }

    public static int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                res[k++] = a[i++];
            } else {
                res[k++] = b[j++];
            }
        }

        if (i == a.length) {
            while (j < b.length) {
                res[k++] = b[j++];
            }
        }
        if (j == b.length) {
            while (i < a.length) {
                res[k++] = a[i++];
            }
        }

        return res;
    }
}
