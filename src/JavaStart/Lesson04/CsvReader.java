package JavaStart.Lesson04;

import java.util.Scanner;

/**
 * Created by Anatoliy on 16.09.2016.
 */
public class CsvReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(";");

        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.nextLine();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

}
