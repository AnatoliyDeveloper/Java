package JavaOOP.Lesson6.User.BadUser;

/**
 * Created by Anatoliy on 19.10.2016.
 */
public class BadUser {

    public static final int MALE = 1;
    public static final int FEMALE = 2;
    public static final int UNDEFINED = 3;

    private final String name;
    private final int age;
    private final int gender;

    public BadUser(String name, int age, int gender) {
        checkGender(gender);

        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private void checkGender(int gender) {
        if (gender < 1 || gender > 3) {
            throw new IllegalArgumentException("illegal gender: " + gender);
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGender() {
        return gender;
    }

    public String getGenderName() {
        switch (gender) {
            case MALE: return "male";
            case FEMALE: return "female";
            default:
            case UNDEFINED: return "unknown";
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + getGenderName() +
                '}';
    }
}
