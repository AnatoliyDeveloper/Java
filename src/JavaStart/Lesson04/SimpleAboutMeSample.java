package JavaStart.Lesson04;

import java.util.Scanner;

/**
 * Created by Anatoliy on 16.09.2016.
 */
public class SimpleAboutMeSample {

    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter your surname: ");
        String surname = scanner.next();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        scanner.close();

        // BL
        String message = "I'm " + name + " " + surname + ", " + age + " years old";

        // Output
        System.out.println(message);
    }

}
