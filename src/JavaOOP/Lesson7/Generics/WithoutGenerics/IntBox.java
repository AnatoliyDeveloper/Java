package JavaOOP.Lesson7.Generics.WithoutGenerics;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class IntBox {

    private int value;

    public IntBox(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "IntBox{" +
                "value=" + value +
                '}';
    }
}
