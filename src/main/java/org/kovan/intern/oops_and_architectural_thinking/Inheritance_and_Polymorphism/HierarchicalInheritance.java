package org.kovan.intern.oops_and_architectural_thinking.Inheritance_and_Polymorphism;
class Laptop{
    String brand="Lenovo";
    int price=1000000;
    int ram=16;//GB
    int storage=512;//GB


    void powerOn(){
        System.out.println("Lenovo laptop is Powering ON........");
    }
    void showDetails(){
        System.out.println("Brand "+brand);
        System.out.println("RAM "+ram +" GB");
        System.out.println("Storage "+storage+" GB");
    }
    void powerOff(){
        System.out.println("Laptop is POWERING OFFF........");
    }

}
class Microprocessor extends Laptop{
    String processorType="interl i5";
    void processData() {
        System.out.println("Microprocessor is processing data");
        System.out.println("ProcessorType "+processorType);
    }


}
class OperatingSystem extends Laptop{
    String os="Window 11";
    void manageResources() {
        System.out.println("Operating System Model is "+os);
        System.out.println("Operating System is managing resources");
    }

}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Microprocessor mp=new Microprocessor();
        mp.powerOn();
        mp.showDetails();
        mp.processData();


        OperatingSystem os=new OperatingSystem();
        os.manageResources();
        os.powerOff();

    }

}
