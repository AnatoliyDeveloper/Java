package JavaOOP.Lesson7.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class Practice {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "John", // "nohJ"
                "Bob", // "boB"
                "Phil", // "lihP"
                "Arnold", // "dlonrA"
                "Hvatit" // "titavH"
        );
        Collections.sort(names);
        System.out.println("Alphabetical order: " + names);

        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Alphabetical order, desc: " + names);

        Collections.sort(names, new LengthComparator());
        System.out.println("Length order: " + names);

        Collections.sort(names, Collections.reverseOrder(new LengthComparator()));
        System.out.println("Length order, desc: " + names);

        Collections.sort(names, new EpicComparator());
        System.out.println("Epic order: " + names);
    }
}

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}

class EpicComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return reversed(a).compareTo(reversed(b));
    }

    private String reversed(String a) {
        return new StringBuilder(a).reverse().toString();
    }
}
