package JavaOOP.Lesson3.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public final class StudentUtils {

    private StudentUtils() {
    }

    public static List<Student> findByFaculty(List<Student> students, String faculty) {
        Args.notNull(students, "students");

        List<Student> results = new ArrayList<>();
        for (Student student : students) {
            if (Objects.equals(student.getFaculty(), faculty)) {
                results.add(student);
            }
        }

        return results;
    }

    public static List<Student> findByCourse(List<Student> students, int cource) {
        Args.notNull(students, "students");

        List<Student> results = new ArrayList<>();
        for (Student student : students) {
            if (student.getCourse() == cource) {
                results.add(student);
            }
        }

        return results;
    }

    public static List<Student> findByBirthDate(List<Student> students, long minBirthDate) {
        Args.notNull(students, "students");

        List<Student> results = new ArrayList<>();
        for (Student student : students) {
            if (student.getBirthDate() >= minBirthDate) {
                results.add(student);
            }
        }

        return results;
    }
}
