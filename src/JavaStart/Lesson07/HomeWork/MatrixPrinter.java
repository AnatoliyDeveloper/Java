package JavaStart.Lesson07.HomeWork;

/**
 * Created by Anatoliy on 24.09.2016.
 */
/*
Написать метод вывода матрицы в консоль. Предполагается, что матрица прямоугольная.
void printMatrix(int[][] matrix)
 */
public class MatrixPrinter {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printMatrix(matrix);
        System.out.println();

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
