package com.bvan.javaoop.collections._3_list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 25.04.2015
 *
 * @author Bohdan Vanchuhov
 */
public class ArrayListSample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");

        String s = arrayList.get(0);
        System.out.println(s);

    }
}
