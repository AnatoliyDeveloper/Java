package JavaStart.Lesson04.conditions.fun;

import java.util.Scanner;

/**
 * @author Bohdan Vanchuhov
 */
public class BossDaughterPresent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter daughter age: ");
        int age = scanner.nextInt();

        checkAge(age);

        String present;
        if (age <= 6) {
            present = "doll";
        } else if (age < 18) {
            present = "new iPhone";
        } else if (age < 25) {
            present = "new husband?";
        } else {
            present = "flowers";
        }

        System.out.println("My boss daughter present is " + present);
    }

    private static void checkAge(int age) {
        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException("Illegal age");
        }
    }

}
