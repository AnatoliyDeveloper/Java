package com.bvan.javaoop.collections._3_list;

import java.util.Arrays;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class UnmodifiedSample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}
