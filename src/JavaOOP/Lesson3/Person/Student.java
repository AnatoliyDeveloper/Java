package JavaOOP.Lesson3.Person;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Student extends Person {

    private String university;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public void study() {
        System.out.println("I'm studying");
    }

    public void drink() {
        System.out.println("Hard drinking. I'm " + name + "!!!");
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
