package JavaStart.Lesson08.HomeWork.Arrays;

/**
 * Created by Anatoliy on 25.09.2016.
 */
/*
Написать метод поиска элемента, который чаще всего встречается в массиве.
Если таких элементов несколько, вернуть самый первый.
Использование коллекций запрещено.
int findFrequentElem(int[] array)
 */
public class FrequentElemFinder {

    public static void main(String[] args) {
        //Input
        int cellNums = (int) (Math.random() * 20 + 1);
        int myArray[] = new int[cellNums];
        fillArray(myArray);

        //Business Logic
        int maxCell = findFrequentElem(myArray);

        //Output
        System.out.println("Cells number: " + cellNums);
        printArray(myArray);
        System.out.print("Frequently number: ");
        if (maxCell == Integer.MIN_VALUE) {
            System.out.println("-");
        }
        else {
            System.out.println(maxCell);
        }
    }

    private static int findFrequentElem(int[] array) {
        int quantityArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                if (array[i] == array[j]) {
                    quantityArray[i]++;
                }

        int maxIndex = 0;
        int maxCell = Integer.MIN_VALUE;
        for (int i = quantityArray.length - 1; i >= 0; i--)
            if (maxCell <= quantityArray[i]) {
                maxCell = quantityArray[i];
                maxIndex = i;
            }

        if (quantityArray[maxIndex] <= 1) {
            return Integer.MIN_VALUE;
        }
        else {
            return array[maxIndex];
        }
    }

    private static void fillArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }
    }

    private static void printArray(int array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (array.length > i + 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
