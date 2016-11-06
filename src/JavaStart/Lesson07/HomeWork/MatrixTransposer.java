package JavaStart.Lesson07.HomeWork;

/**
 * Created by Anatoliy on 24.09.2016.
 */
/*
Написать метод транспонирования матрицы.
Исходная матрица не должна изменяться.
Предполагается, что матрица прямоугольная.
int[][] transpose(int[][] sourceMatrix)
 */
public class MatrixTransposer {

    public static void main(String[] args){

        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        int[][] transposedMatrix = transpose(matrix);

        printMatrix(matrix);
        System.out.println();
        printMatrix(transposedMatrix);
        System.out.println();
    }

    public static int[][] transpose(int[][] sourceMatrix) {
        int rows = sourceMatrix.length;
        int cols = sourceMatrix[0].length;
        int[][] transposedMatrix = new int[cols][rows];
        for (int i = 0; i < sourceMatrix.length; i++) {
            for (int j = 0; j < sourceMatrix[0].length; j++) {
                transposedMatrix[j][i] = sourceMatrix [i][j];
            }
        }
        return transposedMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix){
            for (int elem : row){
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}
