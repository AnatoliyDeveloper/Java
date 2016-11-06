package JavaOOP.Lesson6.User.GoodUser;

/**
 * Created by Anatoliy on 19.10.2016.
 */
public enum Gender {
    MALE("male"),
    FEMALE("female"),
    UNDEFINED("unknown");

    private final String genderName;

    Gender(String genderName) {
        this.genderName = genderName;
    }

    public String getGenderName() {
        return genderName;
    }
}
