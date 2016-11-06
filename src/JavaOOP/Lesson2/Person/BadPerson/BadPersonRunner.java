package JavaOOP.Lesson2.Person.BadPerson;

/**
 * Created by Anatoliy on 05.10.2016.
 */
public class BadPersonRunner {

    public static void main(String[] args) {
        BadPerson person = new BadPerson();
        person.name = "John";
        person.age = 25;

        String info = getInfoMessage(person);
        System.out.println(info);
    }

    private static String getInfoMessage(BadPerson person) {
        return "Hello, I'm " + person.name + ", " + person.age + " years old";
    }
}
