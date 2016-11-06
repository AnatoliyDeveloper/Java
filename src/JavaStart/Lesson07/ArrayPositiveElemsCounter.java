package JavaStart.Lesson07;

/**
 * Created by Anatoliy on 23.09.2016.
 */
/**
 * ѕодсчет количества положительных элементов массива.
 *
 * @author bvanchuhov
 */
public class ArrayPositiveElemsCounter {

    public static void main(String[] args) {
        System.out.println(countPositiveElems(new int[]{10, -20, -30, 40, 50}));
        System.out.println(countPositiveElems(new int[]{-20, -30}));
        System.out.println(countPositiveElems(new int[]{}));
    }

    /**
     * ѕодсчитывает количество положительных элементов массива.
     *
     * @param array исходный массив.
     * @return количество положительных элеметов массива.
     * @throws IllegalArgumentException если массив {@code null}.
     */
    public static int countPositiveElems(int[] array) {
        checkNotNull(array);

        int counter = 0;
        for (int elem : array) {
            if (elem > 0) {
                counter++;
            }
        }

        return counter;
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }
}
