package JavaOOP.Lesson7.Generics.WithGenerics;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class WithGenericRunner {

    public static void main(String[] args) {
        Cat cat = new Cat("Murzik");
        Box<Cat> catBox = new Box<>(cat);

        openBoxAndMeaw(catBox);
    }

    private static void openBoxAndMeaw(Box<Cat> catBox) {
        Cat cat = catBox.getValue();
        cat.meaw();
    }
}
