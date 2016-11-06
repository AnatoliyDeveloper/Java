package JavaOOP.Lesson2.Dog;

/**
 * Created by Anatoliy on 05.10.2016.
 */
public class Dog {

    private final String name;
    private final String ownerName;

    public Dog(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }

    public void bark() {
        System.out.println("Gav");
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
