package com.bvan.javastart.loops;

import java.util.Scanner;

/**
 * @author Bohdan Vanchuhov
 */
public class _6_SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int number;
        do {
            System.out.print("Enter number: ");
            number = scanner.nextInt();

            sum += number;
        } while (number != 0);

        System.out.println(sum);
    }
}
