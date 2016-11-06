package com.bvan.javaoop.collections._4_set._1_tree_set;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Bohdan Vanchuhov
 */
public class _2_SortedSetSample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 7, 15, 20, 17);
        SortedSet<Integer> sortedSet = new TreeSet<>(list);
        System.out.println(sortedSet);

        SortedSet<Integer> subSet = sortedSet.subSet(8, 18);
        System.out.println("[8..18]:\t" + subSet);

        System.out.println("[head..12]:\t" + sortedSet.headSet(12));
        System.out.println("[12..tail]:\t" + sortedSet.tailSet(12));
    }
}
