package JavaStart.Lesson07.HomeWork;

/**
 * Created by Anatoliy on 24.09.2016.
 */
/*
Написать метод поиска индекса строки с максимальной суммой элементов.
Если таких строк несколько, вернуть индекс первой.
Предполагается, что матрица прямоугольная.
int findMaxSumRow(int[][] matrix)
 */
public class MatrixMaxSumRowFinder {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {0, 3, -2},
                {2, 50, 3},
                {-1, 5, 2}
        };

        int maxSumRow = findMaxSumRow(matrix);
        System.out.println("Index max sum row = " + maxSumRow);

    }

    public static int findMaxSumRow(int[][] matrix) {
        int sum1;
        int sum2 = 0;
        int maxSumRow = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum1 = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum1 += matrix[i][j];
            }
            if (sum1 > sum2) {
                sum2 = sum1;
                maxSumRow = i;
            }
        }
        return maxSumRow;
    }
}
