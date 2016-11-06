package JavaOOP.Lesson3.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class StudentRunner {

    public static void main(String[] args) {
        List<Student> students = createStudents();

        List<Student> studentsFromFICS = StudentUtils.findByFaculty(students, "FICS");
        System.out.println("studentsFromFICS = " + studentsFromFICS);

        List<Student> studentsFromCourse4 = StudentUtils.findByCourse(students, 4);
        System.out.println("studentsFromCourse4 = " + studentsFromCourse4);

        List<Student> studentByBirthDate = StudentUtils.findByBirthDate(students, DateUtils.getTimestamp(10, 10, 1994));
        System.out.println("studentByBirthDate = " + studentByBirthDate);
    }

    private static List<Student> createStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student()
                        .setName("John")
                        .setSurname("Smith")
                        .setAddress("John's Address")
                        .setPhoneNumber("+38 (095) 111-11-11")
                        .setBirthDate(DateUtils.getTimestamp(20, 1, 1995))
                        .setFaculty("FICS")
                        .setGroup(3)
        );
        students.add(new Student()
                        .setName("Bob")
                        .setSurname("Huston")
                        .setAddress("Bob's Address")
                        .setPhoneNumber("+38 (065) 222-22-22")
                        .setBirthDate(DateUtils.getTimestamp(2, 5, 1993))
                        .setFaculty("ACTS")
                        .setGroup(5)
        );

        return students;
    }
}
