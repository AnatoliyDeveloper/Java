package JavaOOP.Lesson7.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class ComparableSorting {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 10, 2, 4, 5);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
    }
}
