package JavaOOP.Lesson3.ConstructionSample;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class ConstructionSample {

    public static void main(String[] args) {
        A a = new A();
    }
}

class Person {
    String name = "unnamed";
    int age = -1;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }
}

class A {

    int x = 0;

    public A() {
        System.out.println("Constructor");
    }
}
