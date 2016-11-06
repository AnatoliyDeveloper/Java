package com.bvan.javastart.values_storing._2_reference_and_object;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_EqualReferenceSample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
