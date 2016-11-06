package com.bvan.javastart.loops;

/**
 * @author Bohdan Vanchuhov
 */
public class _4_Recalculation {
    public static void main(String[] args) {
        int n = 10;

        // BAD
        for (int i = 0; i < n / 2; i++) {
            System.out.println("Hello");
        }

        // GOOD
        for (int i = 0, last = n / 2; i < last; i++) {
            System.out.println("Hello");
        }
    }
}
