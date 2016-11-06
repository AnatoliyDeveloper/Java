package JavaStart.Lesson04;

/**
 * Created by Anatoliy on 16.09.2016.
 */
public class WorkingWeekExtendedConditions {

    public static void main(String[] args) {
        int day = 1; // 1..7

        boolean isWorkingDay = day >= 2 && day <= 4; // F
        boolean isJavaCoursesDay = day <= 4 || day == 6; // T
        boolean isFriendsDay = day >= 6; // F

        if (isWorkingDay) {
            System.out.println("Work");
        }
        if (isJavaCoursesDay) {
            System.out.println("Java Courses");
        }
        if (isFriendsDay) {
            System.out.println("Friends");
        }
    }

}
