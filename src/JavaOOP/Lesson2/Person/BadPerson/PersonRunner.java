package JavaOOP.Lesson2.Person.BadPerson;

/**
 * Created by Anatoliy on 02.10.2016.
 */
public class PersonRunner {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 25;

        String message = getPersonInfo(person);

        System.out.println(message);
    }

    private static String getPersonInfo(Person person) {
        return "Hello, I'm " + person.name + ", " + person.age + " years old";
    }
}
