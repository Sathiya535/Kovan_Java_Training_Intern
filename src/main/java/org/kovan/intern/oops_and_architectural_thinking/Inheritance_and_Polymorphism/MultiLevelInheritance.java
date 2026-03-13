package org.kovan.intern.oops_and_architectural_thinking.Inheritance_and_Polymorphism;
class Kovan{
    void company(){
        System.out.println("Company : Kovan ");

    }


}
class SeniorDeveloper extends Kovan{
    void experience(){
        System.out.println("Senior Developer has 10+ years experience");
    }

}
class Intern extends SeniorDeveloper{
    void training(){
        System.out.println("Intern Have Training for 3 Months ");
    }

}

public class MultiLevelInheritance {
    public static void main(String[] args){
        Intern intern=new Intern();
        intern.company();
        intern.experience();
        intern.training();
    }

}
