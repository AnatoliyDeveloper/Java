package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._1_inheritahce.person;

import JavaOOP.Lesson3.CodeOfBohdanVanchuhov.inheritance._1_inheritahce.Util;

import java.util.Date;

/**
 * @author Bohdan Vanchuhov
 */
public class Employee extends Person
{
    public static final int SALARY_PRECISION = 2;
    public static final double SALARY_COEFFICIENT = Math.pow(10, SALARY_PRECISION);

    protected long salary;
    protected Date hireDate;

    Employee(String name, String surname, Date birthDate, long salary, Date hireDate) {
        super(name, surname, birthDate);
        this.salary = salary;
        this.hireDate = Util.cloneDate(hireDate);
    }

    public Employee() {
    }

    public Employee(String name, String surname) {
        super(name, surname);
    }

    public Employee(String name, String surname, Date birthDate) {
        super(name, surname, birthDate);
    }

    @Override
   public String sayHello() {
        return "Hello, I'm employee";
    }

    //----- Getters and Setters -----

    public double getSalary() {
        return salary / SALARY_COEFFICIENT;
    }

    public void setSalary(double salary) {
        this.salary = (int)(salary * SALARY_COEFFICIENT);
    }

    public Date getHireDate() {
        return Util.cloneDate(hireDate);
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = Util.cloneDate(hireDate);
    }

    public void setHireDate(int day, int month, int year) {
        this.hireDate = Util.createDate(day, month, year);
    }
}
