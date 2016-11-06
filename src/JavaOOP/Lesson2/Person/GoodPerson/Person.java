package JavaOOP.Lesson2.Person.GoodPerson;

/**
 * Created by Anatoliy on 05.10.2016.
 */
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String sayHello() {
        return "Hello, I'm " + name + ", " + age + " years old";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (!Validator.isAge(age)) {
            throw new IllegalArgumentException("illegal age");
        }
        this.age = age;
    }

    public int getWeight() {
        return 70;
    }
}
