package com.bvan.javaoop.collections._4_set._2_hash_set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_IncorrectElemSample {
    public static void main(String[] args) {
        Set<A> set = new HashSet<>();
        set.add(new A(10));
        set.add(new A(10));

        System.out.println(set);
    }
}

class A {
    private int x;

    public A(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return Integer.toString(x);
    }
}
