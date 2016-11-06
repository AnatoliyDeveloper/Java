package com.bvan.javaoop.collections._3_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Bohdan Vanchuhov
 */
public class ArrayToListSample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(list);

        list.subList(2, 4).clear();
        System.out.println(list);
    }
}
