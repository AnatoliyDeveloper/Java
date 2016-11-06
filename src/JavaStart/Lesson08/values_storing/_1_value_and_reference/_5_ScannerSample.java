package JavaStart.Lesson08.values_storing._1_value_and_reference;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class _5_ScannerSample {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = scanner1;

        scanner2.useDelimiter(";");

        System.out.print("Enter text: ");
        System.out.println(scanner1.next());
    }
}
