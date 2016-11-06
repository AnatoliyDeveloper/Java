package JavaStart.Lesson07;

/**
 * Created by Anatoliy on 24.09.2016.
 */
/**
 * Вывод елочки.
 *
 * @author bvanchuhov
 */
public class ChristmasTree {

    public static final int STOREYS_QUANTITY = 5;

    public static void main(String[] args) {
        printChristmasTree(STOREYS_QUANTITY);
    }

    private static void printChristmasTree(int storeysQuantity) {
        for (int storeyIndex = 0; storeyIndex < storeysQuantity; storeyIndex++) {
            printStorey(storeyIndex, storeysQuantity);
        }
    }

    private static void printStorey(int storeyIndex, int storeysQuantity) {
        int blacksQuantity = 1;
        int leftWhitesQuantity = storeysQuantity;
        int rowsQuantity = 2 + storeyIndex;

        for (int row = 0; row < rowsQuantity; row++) {
            for (int i = 0; i < leftWhitesQuantity; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < blacksQuantity; i++) {
                System.out.print("*");
            }
            System.out.println();

            blacksQuantity += 2;
            leftWhitesQuantity--;
        }
    }
}
