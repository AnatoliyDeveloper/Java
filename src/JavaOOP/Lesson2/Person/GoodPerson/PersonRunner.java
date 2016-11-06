package JavaOOP.Lesson2.Person.GoodPerson;

/**
 * Created by Anatoliy on 05.10.2016.
 */
public class PersonRunner {

    public static void main(String[] args) {
        Person person = new Person("John", 25);

        String message = person.sayHello();
        System.out.println(message);
    }
}
