package com.bvan.javastart.conditions;

/**
 * @author Bohdan Vanchuhov
 */
public class _5_BooleanTraining {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int z = 30;

        boolean b1 = x < y && z != x || z > x; // T
        System.out.println("1. " + b1);

        boolean b2 = true || true && false || true || false || false; // T
        System.out.println("2. " + b2);

        boolean b3 = !(false || true) && !true && true && false; // F
        System.out.println("3. " + b3);
    }
}
