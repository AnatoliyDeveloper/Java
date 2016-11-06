package JavaStart.Lesson07.HomeWork;

import java.util.Arrays;

/**
 * Created by Anatoliy on 24.09.2016.
 */
/*
Написать метод подсчета среднего арифметического всех элементов матрицы.
Предполагается, что матрица прямоугольная.
double avg(int[][] matrix)
 */
public class MatrixAverageCalculator {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {0, -9, 8},
                {-7, 6, 5},
                {4, -3, 2},
                {4, 3, -2}
        };

        double avg = avg(matrix);
        System.out.println("avg = " + avg);
    }

    public static double avg(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix){
            for (int elem : row){
                sum += elem;
            }
        }
        return sum / (double)(matrix.length * matrix[0].length);
    }
}
