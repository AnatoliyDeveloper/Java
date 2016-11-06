package JavaOOP.Lesson2.HomeWork.Dog;

/**
 * Created by Anatoliy on 09.10.2016.
 */
/*
Создать  объект  класса Щенок,  используя  классы  Животное,  Собака.
Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.
 */
public class DogRunner {

    public static void main(String[] args) {

        Dog puppy = new Dog("Puppy");
        System.out.println("Name " + puppy.getName() + ".");
        System.out.println(puppy.bark());
        System.out.println(puppy.jump());
        System.out.println(puppy.run());
        System.out.println(puppy.bite());
    }
}
