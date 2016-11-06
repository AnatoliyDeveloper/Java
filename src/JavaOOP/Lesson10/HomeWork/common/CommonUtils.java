package JavaOOP.Lesson10.HomeWork.common;

import java.util.List;

/**
 * Created by Anatoliy on 06.11.2016.
 */
public class CommonUtils {

    private CommonUtils() {}

    public static <E> void printList(List<E> list) {
        for (E elem : list) {
            System.out.println(elem);
        }
    }
}
