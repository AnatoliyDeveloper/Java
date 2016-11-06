package JavaStart.Lesson08.values_storing.presentation;

/**
 * @author Bohdan Vanchuhov
 */
public class Sample8 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6, 7}
        };

        fill(matrix, 1);
    }

    public static void fill(int[][] matrix, int filler) {
        for (int i = 0; i < matrix.length; i++) {
            fill(matrix[i], filler);
        }
    }

    public static void fill(int[] array, int filler) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
    }
}
