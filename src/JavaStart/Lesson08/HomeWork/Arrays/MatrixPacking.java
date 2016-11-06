package JavaStart.Lesson08.HomeWork.Arrays;

import java.text.DecimalFormat;

/**
 * Created by Anatoliy on 25.09.2016.
 */
/*
Написать метод уплотнения матрицы за счет удаления из нее строк и столбцов, заполненных нулями.
Исходная матрица не должна изменяться.
Предполагается, что матрица прямоугольная.
int[][] packMatrix(int[][] sourceMatrix)
 */
public class MatrixPacking {

    public static void main(String[] args) {
        //Input
        Matrix myMatrix = new Matrix();
        myMatrix.createMatrix();
        int packedMatrix[][] = myMatrix.createPackedMatrix();

        //Business Logic
        myMatrix.fillMatrix();
        packedMatrix = myMatrix.packMatrix();

        //Output
        System.out.println("Original matrix");
        myMatrix.printMatrix();
        System.out.println("Packed matrix");
        myMatrix.printMatrix(packedMatrix);
    }
}

class Matrix {
    private int tempMatrix[][];
    private int columnsNumber;
    private int rowsNumber;
    private int nullRow;
    private int nullColumn;

    protected Matrix() {
        rowsNumber = (int) (Math.random() * 5 + 5);
        columnsNumber = (int) (Math.random() * 5 + 5);
    }

    protected Matrix(int x, int y) {
        rowsNumber = x;
        columnsNumber = y;
    }

    protected int[][] packMatrix() {
        int tempMatrix[][] = new int[rowsNumber - 1][columnsNumber - 1];
        int yRow = searchNullRow();
        int xColumn = searchNullColumn();
        int yShift = 0;
        int xShift = 0;
        for (int i = 0; i < rowsNumber - 1; i++) {
            xShift = 0;
            if (i == yRow) yShift = 1;
            for (int j = 0; j < columnsNumber - 1; j++) {
                if (j == xColumn) xShift = 1;
                tempMatrix[i][j] = this.tempMatrix[i + yShift][j + xShift];
            }
        }
        return tempMatrix;
    }

    protected void createMatrix() {
        tempMatrix = new int[rowsNumber][columnsNumber];
        nullRow = (int) (Math.random() * rowsNumber);
        nullColumn = (int) (Math.random() * columnsNumber);
    }

    protected int[][] createPackedMatrix() {
        int tempMatrix[][] = new int[rowsNumber - 1][columnsNumber - 1];
        return tempMatrix;
    }

    protected void fillMatrix() {
        for (int i = 0; i < rowsNumber; i++) {
            for (int j = 0; j < columnsNumber; j++) {
                if (i != nullRow && j != nullColumn) tempMatrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    protected void printMatrix() {
        DecimalFormat df = new DecimalFormat("#");
        System.out.println("Rows=" + rowsNumber + " Columns=" + columnsNumber);
        for (int i = 0; i < rowsNumber; i++) {
            System.out.print("[");
            for (int j = 0; j < columnsNumber; j++) {
                if (i == nullRow || j == nullColumn) System.out.print("\u001B[31m");
                System.out.print(tempMatrix[i][j] + "\u001B[0m");
                if (j + 1 != columnsNumber) System.out.print(", ");
            }
            System.out.println("]");
        }
        System.out.println();
    }

    protected void printMatrix(int tempMatrix[][]) {
        int rowsNumber = tempMatrix.length;
        int columnsNumber = tempMatrix[0].length;
        DecimalFormat df = new DecimalFormat("#");
        System.out.println("Rows=" + rowsNumber + " Columns=" + columnsNumber);
        for (int i = 0; i < rowsNumber; i++) {
            System.out.print("[");
            for (int j = 0; j < columnsNumber; j++) {
                System.out.print(tempMatrix[i][j]);
                if (j + 1 != columnsNumber) System.out.print(", ");
            }
            System.out.println("]");
        }
    }

    private int searchNullRow() {
        boolean isNull = false;
        int i;
        int j;
        for (i = 0; i < rowsNumber; i++) {
            for (j = 0; j < columnsNumber; j++) {
                isNull = tempMatrix[i][j] == 0 ? true : false;
                if (!isNull) break;
            }
            if (isNull) return i;
        }
        return i;
    }

    private int searchNullColumn() {
        boolean isNull = false;
        int i;
        int j;
        for (j = 0; j < columnsNumber; j++) {
            for (i = 0; i < rowsNumber; i++) {
                isNull = tempMatrix[i][j] == 0 ? true : false;
                if (!isNull) break;
            }
            if (isNull) return j;
        }
        return j;
    }
}
