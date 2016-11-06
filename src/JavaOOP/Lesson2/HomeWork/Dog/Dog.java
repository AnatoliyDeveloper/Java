package JavaOOP.Lesson2.HomeWork.Dog;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public String bark(){
        return "Dog " + getName() + " is barking";
    }

    public String jump(){
        return "Dog " + getName() + " is jumping";
    }

    public String run(){
        return "Dog " + getName() + " is running";
    }

    public String bite(){
        return "Dog " + getName() + " bites";
    }
}
