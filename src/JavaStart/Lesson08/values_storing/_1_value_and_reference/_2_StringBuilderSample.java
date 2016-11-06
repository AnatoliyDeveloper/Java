package com.bvan.javastart.values_storing._1_value_and_reference;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_StringBuilderSample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("123");
        addHello(sb);
        System.out.println(sb);
    }

    private static void addHello(StringBuilder sb) {
        sb.append("Hello");
    }
}

