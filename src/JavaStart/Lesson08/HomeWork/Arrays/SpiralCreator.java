package JavaStart.Lesson08.HomeWork.Arrays;

import java.text.DecimalFormat;

/**
 * Created by Anatoliy on 25.09.2016.
 */
/*
Ќаписать метод создани€ матрицы размера rows*cols, заполненной в виде спирали, начина€ с 1.
≈сли rows, cols Ц отрицательные, бросить исключение IllegalArgumentException.
int[][] createSpiral(int rows, int cols)
 */
public class SpiralCreator {

    public static void main(String[] args) {
        //Input
        Spirals spiralMatrix = new Spirals();

        //Business Logic
        spiralMatrix.createSpiral();

        //Output
        spiralMatrix.printMatrix();
    }
}

class Spirals {
    private int spiralArray[][];
    private int rows;
    private int cols;

    Spirals() {
        rows = (int) (Math.random() * 5 + 5);
        cols = (int) (Math.random() * 5 + 5);
        spiralArray = new int[rows][cols];
    }

    Spirals(int rows, int cols) {
        if (rows < 0 || cols < 0) throw new IllegalArgumentException("Rows and Cols must be positive!");
        this.rows = rows;
        this.cols = cols;
        spiralArray = new int[this.rows][this.cols];
    }

    protected int[][] createSpiral() {
        int rowsFirst = 0;
        int rowsLast = rows - 1;
        int colsFirst = 0;
        int colsLast = cols - 1;
        int nums = rows * cols;
        int currentNumber = 0;
        while (rowsFirst <= rowsLast && colsFirst <= colsLast) {
            for (int i = colsFirst; i <= colsLast; i++) {
                spiralArray[rowsFirst][i] = currentNumber;
                currentNumber++;
            }
            rowsFirst++;
            if (currentNumber >= nums) break;
            for (int i = rowsFirst; i <= rowsLast; i++) {
                spiralArray[i][colsLast] = currentNumber;
                currentNumber++;
            }
            colsLast--;
            if (currentNumber >= nums) break;
            for (int i = colsLast; i >= colsFirst; i--) {
                spiralArray[rowsLast][i] = currentNumber;
                currentNumber++;
            }
            rowsLast--;
            if (currentNumber >= nums) break;
            for (int i = rowsLast; i >= rowsFirst; i--) {
                spiralArray[i][colsFirst] = currentNumber;
                currentNumber++;
            }
            colsFirst++;
            if (currentNumber >= nums) break;
        }
        return spiralArray;
    }

    protected void printMatrix() {
        DecimalFormat df = new DecimalFormat("00");
        System.out.println("Rows=" + rows + " Cols=" + cols);
        for (int i = 0; i < spiralArray.length; i++) {
            System.out.print("[");
            for (int j = 0; j < spiralArray[0].length; j++) {
                System.out.print(df.format(spiralArray[i][j]));
                if (j + 1 < spiralArray[0].length) System.out.print(", ");
            }
            System.out.println("]");
        }
    }
}
