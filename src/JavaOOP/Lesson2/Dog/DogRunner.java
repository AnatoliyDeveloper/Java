package JavaOOP.Lesson2.Dog;

/**
 * Created by Anatoliy on 05.10.2016.
 */
public class DogRunner {

    public static void main(String[] args) {
        Dog dog =  new Dog("Rex", "John");
        Owner owner = new Owner("John", 25, dog);

        System.out.println(owner);
    }
}
