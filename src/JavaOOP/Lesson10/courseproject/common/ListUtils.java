package JavaOOP.Lesson10.courseproject.common;

import java.util.List;

/**
 * Created by Anatoliy on 05.11.2016.
 */
public final class ListUtils {

    private ListUtils() {}

    /**
     * Построчно печатает элементы списка в консоль.
     *
     * @param list список.
     * @param <T> generic-тип элементов.
     */
    public static <T> void printList(List<T> list) {
        for (T elem : list) {
            System.out.println(elem);
        }
        System.out.println();
    }

    /**
     * Построчно печатает элементы списка в консоль с приветсвенным сообщением.
     *
     * @param <T> generic-тип элементов.
     * @param message приветсвенное сообщение.
     * @param list список.
     */
    public static <T> void printList(String message, List<T> list) {
        System.out.println(message);
        printList(list);
    }
}
