package JavaOOP.Lesson3.Composition;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class User {

    private String name;
    private long birthDate;
    private CV cv;

    public User(String name, long birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public CV getCv() {
        return cv;
    }

    public void setCv(CV cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", cv=" + cv +
                '}';
    }
}
