package JavaOOP.Lesson2.Dog;

/**
 * Created by Anatoliy on 05.10.2016.
 */
public class Owner {

    private final String name;
    private final int age;
    private final Dog dog;

    public Owner(String name, int age, Dog dog) {
        this.name = name;
        this.age = age;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Dog getDog() {
        return dog;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                '}';
    }
}
