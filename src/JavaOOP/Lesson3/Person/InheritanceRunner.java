package JavaOOP.Lesson3.Person;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class InheritanceRunner {

    public static void main(String[] args) {
        Student student = new Student("John-Constantin", 25, "Prog.kiev.ua");

        student.study();
        student.study();
        student.study();

        student.drink();
        student.drink();
        student.drink();
        student.drink();
        student.drink();
    }
}
