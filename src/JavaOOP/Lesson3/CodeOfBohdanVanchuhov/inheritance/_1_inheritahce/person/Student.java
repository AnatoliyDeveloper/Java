package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._1_inheritahce.person;

import java.util.Date;

/**
 * Created on 02.06.2015
 *
 * @author Bohdan Vanchuhov
 */
public class Student extends Person {
    protected String faculty;
    protected int course;
    protected String group;

    private Student(String name, String surname, Date birthDate, String faculty, int course, String group) {
        super(name, surname, birthDate);
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student() {
    }

    public Student(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String sayHello() {
        return "Hello, I'm student ";
    }

    public String sayAboutStudying() {
        return "The studying is good";
    }

    //----- Getters and Setters -----

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
