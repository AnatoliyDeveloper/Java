package com.bvan.javastart.values_storing.presentation;

/**
 * @author Bohdan Vanchuhov
 */
public class Sample4 {
    public static void main(String[] args) {
        String s = "123";
        addHello(s);
        System.out.println(s);
    }

    private static void addHello(String s) {
        s += "Hello";
    }
}
