package JavaOOP.Lesson9.HomeWork.NumbersCounter;

import java.util.*;

/**
 * Created by Anatoliy on 30.10.2016.
 */
public class NumbersCounter {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1
        ));

        Map <Integer, Integer> intMap = new HashMap<>();

        countInt(list, intMap);
    }

    private static void countInt(List<Integer> list, Map<Integer, Integer> intMap) {
        for (int i : list) {
            if (!intMap.containsKey(i)) {
                intMap.put(i, 1);
            } else {
                intMap.put(i, intMap.get(i) + 1);
            }
        }
        System.out.println(intMap);
    }
}
