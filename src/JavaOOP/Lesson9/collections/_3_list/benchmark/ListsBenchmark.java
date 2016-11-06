package com.bvan.javaoop.collections._3_list.benchmark;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created on 25.04.2015
 *
 * @author Bohdan Vanchuhov
 */
public class ListsBenchmark {
    public static final int ELEMS_QUANTITY = 10_000_000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        addElems(arrayList, ELEMS_QUANTITY, null);

        List<Integer> linkedList = new LinkedList<>(arrayList);
        List<Integer> synchronizedList = Collections.synchronizedList(arrayList);

        int getPos = 0;
        System.out.println("Time of get:");
        System.out.printf("ArrayList:\t%10d\n", timeOfGet(arrayList, getPos));
        System.out.printf("LinkedList:\t%10d\n", timeOfGet(linkedList, getPos));
        System.out.printf("SynchList:\t%10d\n", timeOfGet(synchronizedList, getPos));
        System.out.println();

        int insertionPos = 0;
        System.out.println("Time of insert:");
        System.out.printf("ArrayList:\t%10d\n", timeOfInsert(arrayList, insertionPos));
        System.out.printf("LinkedList:\t%10d\n", timeOfInsert(linkedList, insertionPos));
        System.out.printf("SynchList:\t%10d\n", timeOfInsert(synchronizedList, insertionPos));
    }

    private static <T> void addElems(List<T> list, int elemsQuantity, T elem) {
        for (int i = 0; i < elemsQuantity; i++) {
            list.add(elem);
        }
    }

    public static <T> long timeOfGet(List<T> list, int pos) {
        long start = System.nanoTime();

        list.get(pos);

        long finish = System.nanoTime();
        return finish - start;
    }

    public static <T> long timeOfInsert(List<T> list, int pos) {
        long start = System.nanoTime();

        list.add(pos, null);

        long finish = System.nanoTime();
        return finish - start;
    }
}
