package JavaOOP.Lesson10.User;

/**
 * Created by Anatoliy on 05.11.2016.
 */
public enum Gender {
    MALE, FEMALE, UNDEFINED;

    public static boolean isGender(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        for (Gender gender : Gender.values()) {
            if (gender.name().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
