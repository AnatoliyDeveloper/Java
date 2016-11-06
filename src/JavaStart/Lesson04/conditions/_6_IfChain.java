package com.bvan.javastart.conditions;

/**
 * Created on 20.04.2015
 *
 * @author Bohdan Vanchuhov
 */
public class _6_IfChain {
    public static void main(String[] args) {
        int itemType = 5;

        if (itemType == 0) {
            System.out.println("PC");
        } else if (itemType == 1) {
            System.out.println("Notebook");
        } else if (itemType == 2 || itemType == 3) {
            System.out.println("Phone");
        } else {
            System.out.println("ConstructionSample"); // Default
        }
    }
}
