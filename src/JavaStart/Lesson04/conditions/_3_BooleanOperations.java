package com.bvan.javastart.conditions;

/**
 * @author Bohdan Vanchuhov
 */
public class _3_BooleanOperations {
    public static void main(String[] args) {
        System.out.println("F (0) is " + false);
        System.out.println("T (1) is " + true);

        System.out.println();

        System.out.println("OR - Logical '+':");
        System.out.println("F || F = " + (false || false));
        System.out.println("F || T = " + (false || true));
        System.out.println("T || F = " + (true || false));
        System.out.println("T || T = " + (true || true));

        System.out.println();

        System.out.println("AND - Logical '*':");
        System.out.println("F && F = " + (false && false));
        System.out.println("F && T = " + (false && true));
        System.out.println("T && F = " + (true && false));
        System.out.println("T && T = " + (true && true));

        System.out.println();

        System.out.println("NOT:");
        System.out.println("!F = " + !false);
        System.out.println("!T = " + !true);
    }
}
