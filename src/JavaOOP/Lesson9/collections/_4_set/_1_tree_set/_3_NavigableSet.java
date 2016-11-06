package com.bvan.javaoop.collections._4_set._1_tree_set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @author Bohdan Vanchuhov
 */
public class _3_NavigableSet {
    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>(Arrays.asList(10, 7, 15, 20, 17));
        System.out.println(navigableSet);

        System.out.println("ceiling: " + navigableSet.ceiling(16));
        System.out.println("floor: " + navigableSet.floor(16));
        System.out.println();

        System.out.println("Descending order:");
        Iterator<Integer> iterator = navigableSet.descendingIterator();

        while (iterator.hasNext()) {
            Integer elem = iterator.next();
            System.out.println(elem);

            if (elem == 15) {
                iterator.remove();
            }
        }
        System.out.println(navigableSet);

        navigableSet.remove(10);
        System.out.println(navigableSet);
    }
}
