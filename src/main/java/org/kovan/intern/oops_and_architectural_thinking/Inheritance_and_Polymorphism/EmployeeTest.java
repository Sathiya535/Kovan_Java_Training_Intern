package org.kovan.intern.oops_and_architectural_thinking.Inheritance_and_Polymorphism;

final class Employe {

    private final int id;
    private final String name;
    private final double salary;

    public Employe(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

// Test class
class EmployeeTest {
    public static void main(String[] args) {

        Employe emp = new Employe(101, "Sathiya Priya S", 25000);

        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
}

