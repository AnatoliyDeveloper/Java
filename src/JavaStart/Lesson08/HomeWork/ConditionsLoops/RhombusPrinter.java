package JavaStart.Lesson08.HomeWork.ConditionsLoops;

/**
 * Created by Anatoliy on 25.09.2016.
 */

import java.util.Scanner;

/*
Вывод в консоль ромба размера size (нечетное число). Если size – четное или
отрицательное, бросить исключение IllegalArgumentException.
void printRhombus(int size)
 */
public class RhombusPrinter {
    public static void main(String[] args) {
        //Input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rhombus size is an odd positive number = ");
        int size = in.nextInt();
        in.close();

        printRhombus(size);
    }

    public static void printRhombus(int size){
        validationRhombusSize(size);

        int i;
        int j;

        for (i = 0; i < size; i++){
            if ((size % 2) == 1 && size > 0){
                int mid = size / 2 + 1;
                for (i = 1; i <= size; i++){
                    for (j = 1; j <= size; j++){
                        if (j == mid - i + 1 || j == i - mid + 1 || j == mid + i - 1 || j == size + mid - i){
                            System.out.print(" * ");
                        } else  {
                            System.out.print(" . ");
                        }
                        if (j == size){
                            System.out.println();
                        }
                    }
                }
            }
        }
    }

    public static void validationRhombusSize(int size) {
        if (size < 0 || size % 2 == 0){
            throw new IllegalArgumentException("Please enter an odd positive number. Actual number = " + size);
        }
    }
}
