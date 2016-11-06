package com.bvan.javaoop.collections._4_set._1_tree_set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Bohdan Vanchuhov
 */
public class _5_MutableSample {
    public static void main(String[] args) {
        Set<MutableWrapper> wrapperSet = new TreeSet<>();

        wrapperSet.add(new MutableWrapper(10));
        wrapperSet.add(new MutableWrapper(7));
        wrapperSet.add(new MutableWrapper(15));
        wrapperSet.add(new MutableWrapper(20));

        MutableWrapper elem = new MutableWrapper(17);
        wrapperSet.add(elem);

        System.out.println(wrapperSet.contains(elem));
        System.out.println(wrapperSet);

        elem.setValue(-100);
        System.out.println(wrapperSet.contains(elem));
        System.out.println(wrapperSet);
    }
}

class MutableWrapper implements Comparable<MutableWrapper> {
    private int value;

    public MutableWrapper(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(MutableWrapper other) {
        return Integer.compare(value, other.value);
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}

