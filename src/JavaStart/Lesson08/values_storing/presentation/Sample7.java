package com.bvan.javastart.values_storing.presentation;

import java.util.Arrays;

/**
 * @author Bohdan Vanchuhov
 */
public class Sample7 {
    public static void main(String[] args) {
        int[] a1 = new int[5];
        int[] a2 = Arrays.copyOf(a1, a1.length);

        a2[2] = 10;
        System.out.println(a1[2]);
    }
}
