package JavaOOP.Lesson7.HomeWork.Comparing.NamesComparing;

import java.util.Comparator;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class GroupsDescComparator implements Comparator<String> {
    @Override
    public int compare (String name1, String name2) {
        int comparator = Integer.compare(name1.length(),name2.length());
        if (comparator == 0) {
            return name2.compareTo(name1);
        } else {
            return comparator;
        }
    }
}
