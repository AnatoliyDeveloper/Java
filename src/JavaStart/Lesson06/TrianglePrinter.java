package JavaStart.Lesson06;

/**
 * Created by Anatoliy on 21.09.2016.
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        printRow(1);
        printRow(40);
        printTriangle(5);
    }

    private static void printTriangle(int size) {
        for (int row = 1; row <= size; row++) {
            printRow(row);
        }
    }

    private static void printRow(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
