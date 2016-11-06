package JavaOOP.Lesson3.CodeOfBohdanVanchuhov.encapsulation.employee;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created on 26.05.2015
 *
 * @author Bohdan Vanchuhov
 */
public class Employee {
    private String name;
    private double salary;
    private Date hireDate;

    public Employee(String name, double salary,
                    int hireDay, int hireMonth, int hireYear) {
        this.name = name;
        this.salary = salary;

        GregorianCalendar calendar =
                new GregorianCalendar(hireYear, hireMonth - 1, hireDay);
        this.hireDate = calendar.getTime();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", hireDate=").append(hireDate);
        sb.append('}');
        return sb.toString();
    }

    //----- Getters and Setters -----

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
        this.name = name;
    }

    private void checkName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException();
        }
    }

    public void raiseSalary(double percent) {
        salary += salary * percent / 100;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return (Date)hireDate.clone();
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = (hireDate == null) ? this.hireDate : hireDate;
    }
}
