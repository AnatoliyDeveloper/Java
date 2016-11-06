package JavaOOP.Lesson3.Student;

import java.util.GregorianCalendar;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Runner {

    public static void main(String[] args) {
        Student student = new Student()
                .setName("John")
                .setSurname("Smith")
                .setAddress("John's Address")
                .setPhoneNumber("+38 (095) 111-11-11")
                .setBirthDate(getTimestamp(20, 1, 1995))
                .setFaculty("FICS")
                .setGroup(3);

        String s = student.toString();
        System.out.println(s);
    }

    private static long getTimestamp(int dayOfMoth, int month, int year) {
        return new GregorianCalendar(year, month - 1, dayOfMoth).getTime().getTime();
    }

}
