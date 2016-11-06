package JavaStart.Lesson05;

/**
 * Created by Anatoliy on 19.09.2016.
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        int size = 10;

        for (int row = 1; row <= size; row++) {
            for (int i = 0; i < row; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
