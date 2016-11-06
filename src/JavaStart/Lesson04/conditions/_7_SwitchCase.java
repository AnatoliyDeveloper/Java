package com.bvan.javastart.conditions;

/**
 * @author Bohdan Vanchuhov
 */
public class _7_SwitchCase {
    public static void main(String[] args) {
        int itemType = 0;

        switch (itemType) {
            case 0:
                System.out.println("PC");
                break;
            case 1:
                System.out.println("Notebook");
                break;
            case 2: case 3:
                System.out.println("Phone");
                break;
            default:
                System.out.println("ConstructionSample");
        }
    }
}
