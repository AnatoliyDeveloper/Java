package JavaOOP.Lesson4.Party;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 12.10.2016.
 */
public class Party {
    public static void main(String[] args) {
        List<Person> guests = new ArrayList<>();
        guests.add(new Girl());
        guests.add(new Tolik());
        guests.add(new Stripper());
        guests.add(new Girl());
        guests.add(new Slavik());
        guests.add(new Police());

        Person person = guests.get(2);
        if (person instanceof Stripper) {
            Stripper stripper = (Stripper) person;
            stripper.dance();
        } else {
            System.out.println("I'm sorry. I'm not stripper...");
        }

        askHello(guests);
    }

    private static void askHello(List<Person> guests) {
        for (Person guest : guests) {
            guest.sayHello();
        }
    }

    private static void askHello(Person person) {
        person.sayHello();
    }
}

interface Person {
    void sayHello();
}

interface Shooter {
    void shoot();
}

interface Dancer {
    void dance();
}

class Girl implements Person {
    @Override
    public void sayHello() {
        System.out.println("Hello, I'm funny girl;)");
    }

    public void laugh() {
        System.out.println("Hahaha");
    }
}

class Tolik implements Person {
    @Override
    public void sayHello() {
        System.out.println("Zdraste, Ya Tolik");
    }
}

class Slavik implements Person {
    @Override
    public void sayHello() {
        System.out.println("I want beer");
    }
}

class Police implements Person, Shooter {
    @Override
    public void sayHello() {
        System.out.println("Hands up! Where is Tolik?");
    }

    @Override
    public void shoot() {
        System.out.println("Bang-bang");
    }
}

class Stripper implements Person, Dancer {
    @Override
    public void sayHello() {
        System.out.println("Interesting dance");
    }

    @Override
    public void dance() {
        System.out.println("Erotic dancing");
    }
}
