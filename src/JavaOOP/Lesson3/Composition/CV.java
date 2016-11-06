package JavaOOP.Lesson3.Composition;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class CV {

    private String name;
    private long birthDate;
    private int salary;

    public CV(String name, long birthDate, int salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public CV(User user, int salary){
        this(user.getName(), user.getBirthDate(), salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CV{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                '}';
    }
}
