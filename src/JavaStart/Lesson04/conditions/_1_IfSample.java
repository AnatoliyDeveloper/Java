package com.bvan.javastart.conditions;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_IfSample {
    public static void main(String[] args) {
        int x = 200;

        if (x <= 100) {
            System.out.println("Yes");
        }

        //--------------------------------------------------

        boolean isAge = x > 0 && x <= 120;
        if (!isAge) {
            System.out.println("x is not an age");
        }

        //--------------------------------------------------

        if (x > 0) {
            System.out.println("x is positive");
        } else {
            System.out.println("x is not positive");
        }
    }
}
