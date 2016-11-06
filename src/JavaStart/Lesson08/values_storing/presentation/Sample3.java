package com.bvan.javastart.values_storing.presentation;

/**
 * @author Bohdan Vanchuhov
 */
public class Sample3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = sum(a, b);
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
