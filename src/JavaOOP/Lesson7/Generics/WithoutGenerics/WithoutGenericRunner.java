package JavaOOP.Lesson7.Generics.WithoutGenerics;

/**
 * Created by Anatoliy on 23.10.2016.
 */
public class WithoutGenericRunner {

    public static void main(String[] args) {
        Cat cat = new Cat("Murzik");
        //ObjectBox catBox = new ObjectBox(new Dog("Rex", "John"));
        ObjectBox catBox = new ObjectBox(cat);

        openBoxAndMeaw(catBox);
    }

    private static void openBoxAndMeaw(ObjectBox catBox) {
        Object value = catBox.getValue();

        if (value instanceof Cat) {
            Cat cat = (Cat) value;
            cat.meaw();
        } else {
            System.out.println("It's not a cat!!!! Where is my cat?");
        }
    }
}
