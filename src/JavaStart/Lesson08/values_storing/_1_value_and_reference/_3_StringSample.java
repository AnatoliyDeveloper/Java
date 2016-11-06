package com.bvan.javastart.values_storing._1_value_and_reference;

/**
 * @author Bohdan Vanchuhov
 */
public class _3_StringSample {
    public static void main(String[] args) {
        String s = "123";
        addHello(s);
        System.out.println(s);
    }

    private static void addHello(String s) {
        s += "Hello";
    }
}
