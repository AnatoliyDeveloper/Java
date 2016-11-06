package JavaOOP.Lesson1.Cat;

import JavaOOP.Lesson1.Cat.devcat.Cat;
import JavaOOP.Lesson1.Cat.devcat.Sportsman;
import JavaOOP.Lesson1.Cat.devpeople.People;

/**
 * Created by Anatoliy on 02.10.2016.
 */
public class Main {

    static Cat cat;
    static People people;

    public static void main(String[] args) {

        cat = new Cat("Garfild", 2, "Persian");
        people = new People("Anatoliy", "Besorabov", 28, cat);
        people.getCat().setName("George");

        System.out.println(people);
        cat.say();
        people.getCat().say();
        people.sayHello();
        System.out.println();

        Sportsman sportsman = new Sportsman("John", "Constantin", 30, null);
        sportsman.setTypeSport("Football");
        System.out.println(sportsman);
        sportsman.sayHello();
    }
}
