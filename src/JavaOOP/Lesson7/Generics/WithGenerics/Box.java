package JavaOOP.Lesson7.Generics.WithGenerics;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class Box<T extends Cat> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}
