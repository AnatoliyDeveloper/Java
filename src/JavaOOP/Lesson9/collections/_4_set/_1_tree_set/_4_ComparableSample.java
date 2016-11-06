package com.bvan.javaoop.collections._4_set._1_tree_set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Bohdan Vanchuhov
 */
public class _4_ComparableSample {
    public static void main(String[] args) {
        Set<Wrapper> wrapperSet = new TreeSet<>();

        wrapperSet.add(new Wrapper(10));
        System.out.println(wrapperSet);
    }
}

class Wrapper {
    private int value;

    public Wrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
