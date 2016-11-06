package JavaStart.Lesson03.HomeWork;

import java.util.Scanner;

/**
 * Created by Anatoliy on 12.09.2016.
 */
public class NameSubstitutor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter message: ");
        String message = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        String n = "${name}";
        String end = message.replace(n, name);

        System.out.println(end);

        scanner.close();
    }

}
