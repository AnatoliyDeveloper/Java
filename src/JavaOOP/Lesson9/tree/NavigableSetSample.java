package JavaOOP.Lesson9.tree;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;


/**
 * Created by Anatoliy on 29.10.2016.
 */
public class NavigableSetSample {

    public static void main(String[] args) {
        NavigableSet<Integer> navigableSet = new TreeSet<>(Arrays.asList(10, 7, 15, 20, 17));
        System.out.println(navigableSet);

        System.out.println("Ceiling: " + navigableSet.ceiling(16));
        System.out.println("Floor: " + navigableSet.floor(16));
        System.out.println();

        System.out.println("Descending order:");
        Iterator<Integer> iterator = navigableSet.descendingIterator();
        while (iterator.hasNext()) {
            Integer elem = iterator.next();
            System.out.println(elem);
        }
    }
}
