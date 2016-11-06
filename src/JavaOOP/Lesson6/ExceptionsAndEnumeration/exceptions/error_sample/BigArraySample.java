package ua.kiev.prog.javaoop.exceptions.error_sample;

import java.util.Arrays;

/**
 * @author Bohdan Vanchuhov
 */
public class BigArraySample {
    public static void main(String[] args) {
        int[] array = null;

        try {
            array = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("OutOfMemoryError");
        }

        System.out.println(Arrays.toString(array));
    }
}
