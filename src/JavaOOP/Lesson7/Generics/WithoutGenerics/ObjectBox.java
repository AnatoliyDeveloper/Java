package JavaOOP.Lesson7.Generics.WithoutGenerics;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class ObjectBox {

    private Object value;

    public ObjectBox(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ObjectBox{" +
                "value=" + value +
                '}';
    }
}
