package JavaStart.Lesson05;

/**
 * @author bvanchuhov
 */
public class EvensPrinter {

    public static void main(String[] args) {
        // Input
        int from = 11;
        int to = 20;

        // BL
        if (from % 2 != 0) {
            from++;
        }
        for (int i = from; i <= to; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
