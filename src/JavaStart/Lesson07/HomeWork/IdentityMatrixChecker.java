package JavaStart.Lesson07.HomeWork;

/**
 * Created by Anatoliy on 24.09.2016.
 */
/*
Написать метод определения, является ли матрица единичной.
Исходная матрица не должна изменяться.
Предполагается, что матрица прямоугольная.
Если матрица НЕ квадратная, бросить исключение IllegalArgumentException.
boolean isIdentity(int[][] matrix)
 */
public class IdentityMatrixChecker
{

    public static void main(String[] args)
    {

        int[][] matrix = new int[][]{
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        printMatrix(matrix);
        System.out.println();
        System.out.println(isIdentity(matrix));
    }

    public static void printMatrix(int[][] matrix)
    {
        for (int[] row : matrix)
        {
            for (int elem : row)
            {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

    private static boolean isIdentity(int[][] matrix) {
        if (matrix.length != matrix[0].length) {
            throw new IllegalArgumentException("Matrix should not square.");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++){
                if ((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)){
                    return false;
                }
            }
        }
        return true;
    }
}
