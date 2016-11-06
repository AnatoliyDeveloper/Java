package JavaStart.Lesson07;

/**
 * Created by Anatoliy on 23.09.2016.
 */
/**
 * Поиск минимального элемента массива.
 *
 * @author bvanchuhov
 */
public class MinFinder {

    public static void main(String[] args) {
        System.out.println(min(new int[] {50, 20, 30, -10}));
        System.out.println(min(new int[] {}));
    }

    /**
     * Находит минимальный элемент массива.
     *
     * @param array исходный массив.
     * @return минимальный элемент массива.
     * @throws IllegalArgumentException если массив {@code null} или пустой.
     */
    public static int min(int[] array) {
        checkNotNull(array);
        checkNotEmpty(array);

        int min = array[0];

        for (int elem : array) {
            if (min > elem) {
                min = elem;
            }
        }

        return min;
    }

    private static void checkNotEmpty(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("empty array");
        }
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }
}
