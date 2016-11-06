package JavaStart.Lesson08;

/**
 * Created by Anatoliy on 28.09.2016.
 */
public class Matrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };
        printMatrix(matrix);
        System.out.println();

        int[][] rectangleMatrix = new int[3][5];
        printMatrix(rectangleMatrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            printArray(row);
        }
    }

    private static void printArray(int[] row) {
        for (int elem : row) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }
}
