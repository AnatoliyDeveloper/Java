package JavaStart.Lesson03.input;

import java.util.Scanner;

/**
 * @author Bohdan Vanchuhov
 */
public class PersonInfoSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, I'm " + name + ", " +
                age + " years old");
    }
}
