package com.bvan.javastart.conditions;

/**
 * @author bvanchuhov
 */
public class NullPointerSample {
    public static void main(String[] args) {
        String s = null;

        if (s.equals("Hello")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
