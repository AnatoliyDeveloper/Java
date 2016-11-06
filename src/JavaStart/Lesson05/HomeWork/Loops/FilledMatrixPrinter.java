package JavaStart.Lesson05.HomeWork.Loops;

import java.util.Scanner;

/**
 * Created by Anatoliy on 19.09.2016.
 */
/*
Вывод на экран матрицы rows * cols, заполненной filler. Если rows < 0 или cols < 0,
бросить исключение IllegalArgumentException.
 */
public class FilledMatrixPrinter {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter rows = ");
        int rows = in.nextInt();
        System.out.print("Enter cols = ");
        int cols = in.nextInt();
        System.out.print("Enter filler = ");
        int filler = in.nextInt();
        in.close();

        if (rows < 0 || cols < 0) {
            throw new IllegalArgumentException("You entered rows and/or cols equal zero.\n" +
                    "Please change rows and/or cols. The actual rows = " + rows + " and cols = " + cols);
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++){
                System.out.print(filler + " ");
            }
            System.out.println();
        }
    }
}
