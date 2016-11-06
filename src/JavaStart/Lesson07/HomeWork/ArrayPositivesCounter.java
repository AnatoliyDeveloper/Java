package JavaStart.Lesson07.HomeWork;

/**
 * Created by Anatoliy on 23.09.2016.
 */
/*
Написать метод подсчета количества положительных чисел в массиве.
 */
public class ArrayPositivesCounter {

    public static void main(String[] args) {

        int[] array = {-3, 0, 1, -4, 2, -5};

        System.out.println("Positives counter = " + countPositives(array));

    }

    public static int countPositives(int[] array) {
        int counter = 0;
        for (int elem : array){
            if (elem > 0){
                counter++;
            }
        }
        return counter;
    }
}
