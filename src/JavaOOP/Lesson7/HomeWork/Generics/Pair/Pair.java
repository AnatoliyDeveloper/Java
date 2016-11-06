package JavaOOP.Lesson7.HomeWork.Generics.Pair;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class Pair <L, R> {

    private final L left;
    private final R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }
}
