package com.bvan.javastart.loops;

/**
 * @author Bohdan Vanchuhov
 */
public class _5_ConstantBorder {
    public static final int OUTPUTS_QUANTITY = 1000;

    public static void main(String[] args) {
        // BAD
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello");
        }

        // GOOD
        for (int i = 0; i < OUTPUTS_QUANTITY; i++) {
            System.out.println("Hello");
        }
    }
}
