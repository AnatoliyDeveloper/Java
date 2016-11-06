package JavaOOP.Lesson3.Person;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Employee extends Person {

    private String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public void work() {
        System.out.println("I'm working");
    }

    public void drink() {
        System.out.println("Hard drinking");
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
