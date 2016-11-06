package JavaOOP.Lesson9.tree.elems_contract.without_contract;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Anatoliy on 29.10.2016.
 */
public class TreeElemsWithoutContract {

    public static void main(String[] args) {
        Set<Wrapper> wrapperSet = new TreeSet<>();

        wrapperSet.add(new Wrapper(10)); // бросается ClassCastException
        System.out.println(wrapperSet);
    }
}

class Wrapper {

    private final int value;

    public Wrapper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
