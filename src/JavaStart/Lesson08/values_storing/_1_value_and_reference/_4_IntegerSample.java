package com.bvan.javastart.values_storing._1_value_and_reference;

/**
 * @author Bohdan Vanchuhov
 */
public class _4_IntegerSample {
    public static void main(String[] args) {
        Integer x = 10;
        add(x);
        System.out.println(x);
    }

    private static void add(Integer x) {
        x += 100;
    }
}
