package JavaStart.Lesson06.Arrays;

/**
 * @author Bohdan Vanchuhov
 */
public class _7_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6, 7}
        };

        printMatrix(matrix);
        System.out.println();

        printMatrixForeach(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            printArray(matrix[rowIndex]);
        }
    }

    private static void printArray(int[] array) {
        int lastIndex = array.length - 1;
        for (int i = 0; i < lastIndex; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println(array[lastIndex]);
    }


    private static void printMatrixForeach(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}
