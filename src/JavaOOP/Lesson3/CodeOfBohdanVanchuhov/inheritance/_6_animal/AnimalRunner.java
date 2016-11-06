package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._6_animal;

/**
 * Created on 02.06.2015
 *
 * @author Bohdan Vanchuhov
 */
public class AnimalRunner {
    public static void main(String[] args) {
        Dog dog = new Dog("Aban");
        System.out.println(dog.getName());
        System.out.println(dog.bark());
    }
}

class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public String bark() {
        return "Dog " + name + " is barking";
    }
}
