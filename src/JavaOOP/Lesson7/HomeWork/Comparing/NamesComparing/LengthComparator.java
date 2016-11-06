package JavaOOP.Lesson7.HomeWork.Comparing.NamesComparing;

import java.util.Comparator;

/**
 * Created by Anatoliy on 23.10.2016.
 */
class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}
