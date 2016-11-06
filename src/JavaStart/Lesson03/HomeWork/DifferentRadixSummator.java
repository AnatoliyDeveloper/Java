package JavaStart.Lesson03.HomeWork;

import java.util.Scanner;

/**
 * Created by Anatoliy on 12.09.2016.
 */
public class DifferentRadixSummator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X in Bin: ");
        int x = scanner.nextInt(2);

        System.out.print("Enter Y in Oct: ");
        int y = scanner.nextInt(8);

        System.out.print("Enter Z in Hex: ");
        int z = scanner.nextInt(16);

        int xyz = x + y + z;

        System.out.println("X + Y + Z = " + xyz);

        scanner.close();

    }

}
