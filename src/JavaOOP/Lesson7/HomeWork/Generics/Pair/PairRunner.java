package JavaOOP.Lesson7.HomeWork.Generics.Pair;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class PairRunner {

    public static void main(String[] args) {

        Pair<Integer, Integer> p1 = new Pair<>(100, 200);
        Pair<String, Integer> p2 = new Pair<>("Hello World", 1000);

        System.out.println(p1.getLeft());
        System.out.println(p1.getRight());
        System.out.println(p2.getRight());
        System.out.println(p2.getLeft());
    }
}
