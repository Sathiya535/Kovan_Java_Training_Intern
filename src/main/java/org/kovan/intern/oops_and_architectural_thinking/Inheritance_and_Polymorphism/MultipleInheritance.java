package org.kovan.intern.oops_and_architectural_thinking.Inheritance_and_Polymorphism;

interface ExperienceDeveloper{
    void writeCode();
}
interface Tester{
    void testCode();
}
class SoftwareEngineer implements ExperienceDeveloper,Tester{
    public void writeCode(){
        System.out.println("Developer writing the code");
    }
    public void testCode(){
        System.out.println("Tester testing the code");
    }
}

public class MultipleInheritance {
    public static void main(String[] args){
        SoftwareEngineer engineer =new SoftwareEngineer();
        engineer.writeCode();
        engineer.testCode();
    }

}
