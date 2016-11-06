package JavaOOP.Lesson7.Generics.WithoutGenerics;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class StringBox {

    private String value;

    public StringBox(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StringBox{" +
                "value='" + value + '\'' +
                '}';
    }
}
