package JavaStart.Lesson08.HomeWork.Arrays;

import java.text.DecimalFormat;

/**
 * Created by Anatoliy on 25.09.2016.
 */
/*
Написать метод создания треугольника Паскаля размера n+1.
Если n < 0, бросить исключение IllegalArgumentException.
Хитрые формулы использовать не нужно.
Просто найдите закономерность в построении треугольника.
int[][] createPascalTriangle(int n)
 */
public class PascalTriangleCreator {

    public static void main(String[] args) {
        //Input
        PascalTriangle myTriangle = new PascalTriangle();
        myTriangle.createPascalTriangleMatrix();

        //Business Logic
        myTriangle.fillPascalTriangleMatrix();

        //Output
        myTriangle.printPascalTriangleMatrix();
    }
}

final class PascalTriangle {
    private int triangleArray[][];
    private int nRows;
    private int columnsNumber;
    private int rowsNumber;
    private int centralColumn;
    private int oddRowShift;

    PascalTriangle() {
        nRows = (int) (Math.random() * 10);
    }

    PascalTriangle(int nRows) {
        if (nRows < 0) throw new IllegalArgumentException("N is " + nRows + ", but must be positive!");
        this.nRows = nRows;
    }

    protected void fillPascalTriangleMatrix() {
        int currentColumn;
        for (int i = 0; i <= nRows; i++) {
            oddRowShift = 0;
            for (int j = 0; j < i + 1; j++) {
                currentColumn = centralColumn - i / 2 + j - i % 2 + oddRowShift;
                if (i % 2 != 0 && currentColumn == centralColumn) {
                    oddRowShift = 1;
                    currentColumn++;
                }
                triangleArray[i][currentColumn] = (i == 0 || j == 0 || i == j) ? 1 : cellCalculate(i, j);
            }
        }
    }

    protected void createPascalTriangleMatrix() {
        columnsNumber = nRows % 2 != 0 ? nRows + 1 : nRows;
        rowsNumber = nRows;
        centralColumn = columnsNumber / 2;
        triangleArray = new int[rowsNumber + 1][columnsNumber + 1];
    }

    protected void printPascalTriangleMatrix() {
        DecimalFormat df = new DecimalFormat("000");
        System.out.println("Center=" + centralColumn + " N=" + nRows + " Rows=" + triangleArray.length + " Cols=" + triangleArray[0].length);
        for (int i = 0; i < triangleArray.length; i++) {
            System.out.print("[");
            for (int j = 0; j < triangleArray[0].length; j++) {
                if (triangleArray[i][j] != 0) {
                    System.out.print(df.format(triangleArray[i][j]));
                } else {
                    System.out.print("...");
                }
                if (j + 1 < triangleArray[0].length) System.out.print(" ");
            }
            System.out.println("]");
        }
    }

    private int factorial(int n) {
        if (n == 1) return 1;
        return factorial(n - 1) * n;
    }

    private int cellCalculate(int n, int m) {
        return factorial(n) / (factorial(m) * factorial(n - m));
    }
}
