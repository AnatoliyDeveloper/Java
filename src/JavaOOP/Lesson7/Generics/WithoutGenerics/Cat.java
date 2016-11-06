package JavaOOP.Lesson7.Generics.WithoutGenerics;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class Cat {

    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void meaw() {
        System.out.println("Meaw-meaw, I'm " + name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
