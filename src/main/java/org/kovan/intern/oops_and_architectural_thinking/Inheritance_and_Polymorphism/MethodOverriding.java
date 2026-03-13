package org.kovan.intern.oops_and_architectural_thinking.Inheritance_and_Polymorphism;

class Officers {

    public double calculateSalary() {
        return 30000.0;
    }

    public String getRole() {
        return "Officers";
    }
}
// Child class 1
class Workers extends Officers {


    public double calculateSalary() {
        return 50000.0;
    }


    public String getRole() {
        return "Workers";
    }
}

// Child class 2
class Interns extends Officers {

    @Override
    public double calculateSalary() {
        return 15000.0;
    }

    @Override
    public String getRole() {
        return "Intern";
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Officers ofc1 = new Workers(); // Runtime polymorphism
        Officers ofc2 = new Interns();    // Runtime polymorphism

        System.out.println("Role: " + ofc1.getRole());
        System.out.println("Salary: " + ofc1.calculateSalary());

        System.out.println("----------------------");

        System.out.println("Role: " + ofc2.getRole());
        System.out.println("Salary: " + ofc2.calculateSalary());
    }
}
