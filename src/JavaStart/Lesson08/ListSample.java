package JavaStart.Lesson08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anatoliy on 28.09.2016.
 */
public class ListSample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-5, 10, 3, 0, 10);
        Collections.sort(list);
        System.out.println(list);

        List<Integer> allPositiveElems = findAllPositiveElems(list);
        System.out.println(allPositiveElems);
    }

    public static List<Integer> findAllPositiveElems(List<Integer> list) {
        List<Integer> res = new ArrayList<>();

        for (Integer elem : list) {
            if (elem > 0) {
                res.add(elem);
            }
        }

        return res;
    }

}
