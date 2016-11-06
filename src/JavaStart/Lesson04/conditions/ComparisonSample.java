package com.bvan.javastart.conditions;

/**
 * @author bvanchuhov
 */
public class ComparisonSample {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int compareResult = (a > b) ? 1 : ((a == b) ? 0 : -1);

        System.out.println(compareResult);
    }
}
