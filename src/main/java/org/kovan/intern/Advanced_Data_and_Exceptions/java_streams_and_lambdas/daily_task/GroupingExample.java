package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas.daily_task;
import java.util.*;
import java.util.stream.*;

// Department Enum
enum Department {
    HR,
    IT,
    SALES
}

// Employee Class
class Employee {

    private String name;
    private Department department;
    private double salary;

    // Constructor
    public Employee(String name, Department department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // toString() for printing
    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}


public class GroupingExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Lala", Department.IT, 60000),
                new Employee("Priya", Department.HR, 50000),
                new Employee("Arun", Department.IT, 75000),
                new Employee("Kumar", Department.SALES, 45000),
                new Employee("Divya", Department.HR, 55000),
                new Employee("Sathish", Department.SALES, 48000)
        );

        // Grouping by Department
        Map<Department, List<Employee>> groupedEmployees = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));


        for (Map.Entry<Department, List<Employee>> entry : groupedEmployees.entrySet()) {

            System.out.println("Department: " + entry.getKey());
            for (Employee emp : entry.getValue()) {
                System.out.println("   " + emp);
            }
            System.out.println();
        }
    }
}
