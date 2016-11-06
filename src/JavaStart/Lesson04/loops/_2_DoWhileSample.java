package com.bvan.javastart.loops;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_DoWhileSample {
    public static void main(String[] args) {
        int n = 10;

        int i = 0;
        do {
            System.out.println((i + 1) + ". Hello");
            i++;
        } while (i < n);
    }
}
