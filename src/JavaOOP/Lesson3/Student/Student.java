package JavaOOP.Lesson3.Student;

import java.util.Objects;

/**
 * Created by Anatoliy on 09.10.2016.
 */
public class Student {

    private static int nextId = 0;

    private final int id = nextId++;
    private String name;
    private String surname;
    private String patronymic;
    private long birthDate;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private int group;

    public Student() {
    }

    //----- Getters and Setters -----

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Student setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Student setPatronymic(String patronymic) {
        this.patronymic = patronymic;
        return this;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public Student setBirthDate(long birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Student setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Student setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getFaculty() {
        return faculty;
    }

    public Student setFaculty(String faculty) {
        this.faculty = faculty;
        return this;
    }

    public int getCourse() {
        return course;
    }

    public Student setCourse(int course) {
        this.course = course;
        return this;
    }

    public int getGroup() {
        return group;
    }

    public Student setGroup(int group) {
        this.group = group;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return birthDate == student.birthDate &&
                course == student.course &&
                group == student.group &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(patronymic, student.patronymic) &&
                Objects.equals(address, student.address) &&
                Objects.equals(phoneNumber, student.phoneNumber) &&
                Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, birthDate, address, phoneNumber, faculty, course, group);
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}
