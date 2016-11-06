package JavaStart.Lesson07.HomeWork;

/**
 * Created by Anatoliy on 23.09.2016.
 */
/*
Написать методы поиска индекса первого и последнего положительного числа.
Если положительных чисел нет, вернуть -1.
 */
public class ArrayPositiveFinder {

    public static void main(String[] args) {

        int[] array = {-3, 0, -1, 4, -2, 5, 6, 0, -10};

        System.out.println("First positive element index = " + findFirstPositiveElemIndex(array));
        System.out.println("Last positive element index = " + findLastPositiveElemIndex(array));

    }

    public static int findFirstPositiveElemIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ( array[i] > 0){
                return i;
            }
        }
        return -1;
    }

    public static int findLastPositiveElemIndex(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if ( array[i] > 0){
                return i;
            }
        }
        return -1;
    }
}
