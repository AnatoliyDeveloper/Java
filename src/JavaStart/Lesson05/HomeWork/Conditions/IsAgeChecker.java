package JavaStart.Lesson05.HomeWork.Conditions;

import java.util.Scanner;

/**
 * Created by Anatoliy on 18.09.2016.
 */
/*
Определение корректности заданного возраста. Возраст может принимать значения
в диапазоне 1..120.
 */
public class IsAgeChecker {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter age = ");
        int age = in.nextInt();
        in.close();

        System.out.println(isAge(age));
    }

    static boolean isAge(int age) {
        if (age >= 1 & age <= 120) {
            return true;
        } else {
            return false;
        }
    }
}
