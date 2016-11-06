package com.bvan.javaoop.collections._4_set._2_hash_set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_HashSetSample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // В любом порядке

        set.add(10);
        set.add(7);
        set.add(15);
        set.add(20);
        set.add(17);

        System.out.println(set);

        set.add(10);
        System.out.println(set);

        System.out.println(set.contains(7));
    }
}
