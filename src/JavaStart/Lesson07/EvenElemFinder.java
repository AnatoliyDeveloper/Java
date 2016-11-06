package JavaStart.Lesson07;

/**
 * Created by Anatoliy on 23.09.2016.
 */
/**
 * Ћинейный поиск четных элементов массива.
 *
 * @author bvanchuhov
 */
public class EvenElemFinder {

    public static void main(String[] args) {
        int[] array = {3, 5, -1, 30, 0, 10, 5};

        System.out.println("First even elem: " + findFirstEvenElem(array));
        System.out.println("First even elem index: " + findFirstEvenIndex(array));
        System.out.println("Last even elem: " + findLastEvenElem(array));
        System.out.println("Last even elem index: " + findLastEvenIndex(array));
    }

    /**
     * Ќаходит первый четный элемент массива.
     *
     * @param array исходный массив.
     * @return первый четный элемент массива или {@code Integer.MIN_VALUE}, если такого элемнта нет.
     * @throws IllegalArgumentException если массив {@code null}.
     */
    public static int findFirstEvenElem(int[] array) {
        checkNotNull(array);

        for (int elem : array) {
            if (isEven(elem)) {
                return elem;
            }
        }

        return Integer.MIN_VALUE;
    }

    /**
     * Ќаходит последний четный элемент массива.
     *
     * @param array исходный массив.
     * @return последний четный элемент массива или {@code Integer.MIN_VALUE}, если такого элемнта нет.
     * @throws IllegalArgumentException если массив {@code null}.
     */
    public static int findLastEvenElem(int[] array) {
        checkNotNull(array);

        for (int i = array.length - 1; i >= 0; i--) {
            int elem = array[i];
            if (isEven(elem)) {
                return elem;
            }
        }

        return Integer.MIN_VALUE;
    }

    /**
     * Ќаходит индекс первого четного элемента массива.
     *
     * @param array исходный массив.
     * @return индекс первого четного элемента массива или -1, если такого элемнта нет.
     * @throws IllegalArgumentException если массив {@code null}.
     */
    public static int findFirstEvenIndex(int[] array) {
        checkNotNull(array);

        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            if (isEven(elem)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Ќаходит индекс последнего четного элемента массива.
     *
     * @param array исходный массив.
     * @return индекс последнего четного элемента массива или -1, если такого элемнта нет.
     * @throws IllegalArgumentException если массив {@code null}.
     */
    public static int findLastEvenIndex(int[] array) {
        checkNotNull(array);

        for (int i = array.length - 1; i >= 0; i--) {
            int elem = array[i];
            if (isEven(elem)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * ѕровер€ет, четное ли число.
     *
     * @param n исходное число.
     * @return {@code true}, если число четное.
     */
    private static boolean isEven(int n) {
        return n % 2 == 0;
    }

    private static void checkNotNull(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("null array");
        }
    }
}
