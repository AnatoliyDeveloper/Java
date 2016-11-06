package com.bvan.javaoop.collections._4_set._1_tree_set;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Bohdan Vanchuhov
 */
public class _1_TreeSetSample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(); // В порядке возрастания

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
