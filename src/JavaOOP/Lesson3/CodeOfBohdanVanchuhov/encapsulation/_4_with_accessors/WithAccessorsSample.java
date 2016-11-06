package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.encapsulation._4_with_accessors;

/**
 * @author Bohdan Vanchuhov
 */
public class WithAccessorsSample {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        person.sayHello();

        person.setAge(-100);
        person.sayHello();
    }
}

class Person {
    private String name;
    private double age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name + ", " + age + " years old");
    }

    //----- Getters and Setters -----

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return (int)age;
    }

    public void setAge(int age) {
        setAbsoluteAge(age);
    }

    private void checkAge(double age) {
        if (age <= 0. || age >= 120.) {
            throw new IllegalArgumentException("Age should be in the range [1..119]");
        }
    }

    public void setAbsoluteAge(double age) {
        checkAge(age);
        this.age = age;
    }

    public double getAbsoluteAge() {
        return age;
    }
}