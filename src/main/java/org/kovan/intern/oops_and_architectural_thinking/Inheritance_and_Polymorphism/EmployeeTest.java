package org.kovan.intern.oops_and_architectural_thinking.Inheritance_and_Polymorphism;

final class Employe {

    final private  int id;
   final private  String name;
   final private double salary;

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

        Employe emp = new Employe();

        System.out.println(emp.getId());
       System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
}

