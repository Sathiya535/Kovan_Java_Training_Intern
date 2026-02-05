package org.kovan.intern.oops_and_architectural_thinking.Inheritance_and_Polymorphism;
class Employee{
    int salary=100000;
}
class Developer extends Employee{
    int bonus=10000;

}

public class SingleInheritance {
    public static void main(String[] args) {
        Developer developer=new Developer();
        System.out.println("developer salary "+developer.salary);
        System.out.println("Bonus is "+developer.bonus);
        System.out.println("TOTAL "+(developer.salary+developer.bonus));


    }

}

