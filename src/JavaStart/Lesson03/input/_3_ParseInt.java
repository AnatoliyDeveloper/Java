package JavaStart.Lesson03.input;

import java.util.Scanner;

/**
 * Created on 20.04.2015
 *
 * @author Bohdan Vanchuhov
 */
public class _3_ParseInt {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter int: ");
        String inString = scanner.next(); // "10"

        int x = Integer.parseInt(inString); // "10" -> 10 (String -> int)

        // Main Logic
        x += 10;

        // Output
        String outString = Integer.toString(x); // 20 -> "20" (int -> String)
        System.out.println(outString);
    }
}
