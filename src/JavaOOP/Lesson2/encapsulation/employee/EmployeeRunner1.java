package ua.kiev.prog.javaoop.encapsulation.employee;

import java.util.Date;

/**
 * Created on 26.05.2015
 *
 * @author Bohdan Vanchuhov
 */
public class EmployeeRunner1 {
    public static void main(String[] args) {
        Employee employee = new Employee("Bohdan", 2500, 1, 1, 2000);
        employee.setHireDate(null);
        System.out.println(employee);

        increaseHireDate(employee);
        System.out.println(employee);

        //--------------------------------------------------

        Employee[] employees = createEmployees();

        double salarySum = calcSalarySum(employees);
        System.out.println(salarySum);
    }

    private static void increaseHireDate(Employee employee) {
        Date hireDate = employee.getHireDate();
        hireDate.setTime(hireDate.getTime() + 1000_000_000_000L);
    }

    private static Employee[] createEmployees() {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Bohdan", 2500, 1, 1, 2000);
        employees[1] = new Employee("Serhey", 3000, 2, 1, 2000);
        employees[2] = new Employee("John", 2000, 3, 1, 2000);

        return employees;
    }

    private static void raiseSalaries(Employee[] employees, double raisePercent) {
        for (Employee employee : employees) {
            employee.raiseSalary(raisePercent);
        }
    }

    private static double calcSalarySum(Employee[] employees) {
        double salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        return salarySum;
    }
}
