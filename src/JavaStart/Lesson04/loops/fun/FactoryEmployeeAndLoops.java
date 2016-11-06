package com.bvan.javastart.loops.fun;

/**
 * @author Bohdan Vanchuhov
 */
public class FactoryEmployeeAndLoops {
    public static final int START_HOURS = 9;
    public static final int FINISH_HOURS = 18;

    public static void main(String[] args) {
        whileWork();
        System.out.println();

        doWhileWork();
        System.out.println();

        forWork();
        System.out.println();
    }

    private static void forWork() {
        // hours = 9..17
        // for (инициализация; условие; инкремент) {}
        for (int hours = START_HOURS; hours < FINISH_HOURS; hours++) {
            System.out.print(hours + ":00 - ");
            workAndCry();
        }

        System.out.println("yahoo");
    }

    private static void whileWork() {
        int hours = START_HOURS; // инициализация
        while (hours < FINISH_HOURS) { // условие цикла
            System.out.print(hours + ":00 - ");
            workAndCry();

            hours++; // инкремент
        }
        System.out.println("yahoo");
    }

    private static void doWhileWork() {
        int hours = START_HOURS;
        do {
            System.out.print(hours + ":00 - ");
            workAndCry();

            hours++;
        } while (hours < FINISH_HOURS);

        System.out.println("yahoo");
    }

    private static void workAndCry() {
        System.out.println("Cry");
    }
}
