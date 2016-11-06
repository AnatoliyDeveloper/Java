package JavaStart.Lesson04;

/**
 * Created by Anatoliy on 16.09.2016.
 */
public class WorkingWeekConditions {

    public static void main(String[] args) {
        int day = 5; // 1..7

        boolean isFriendsDay = day == 1 || day > 4;
//                !(day >= 2 && day <= 4);

        if (isFriendsDay) {
            System.out.println("Friends");
        }
        System.out.println("Java Courses");
    }

}
