package com.bvan.javastart.conditions;

/**
 * @author Bohdan Vanchuhov
 */
public class _8_BooleanOperationPartExecution {
    public static void main(String[] args) {
        String s = null;

        if (s != null && s.equals("hello")) {
            System.out.println("1. OK");
        }

        //--------------------------------------------------

        if ("hello".equals(s)) {
            System.out.println("2. OK");
        }
    }
}
