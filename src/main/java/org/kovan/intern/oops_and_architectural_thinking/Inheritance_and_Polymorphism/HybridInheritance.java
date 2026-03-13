package org.kovan.intern.oops_and_architectural_thinking.Inheritance_and_Polymorphism;
interface Vehicle{
    void start();
}
class Car{
    public void fuel(){
        System.out.println("Car uses Feul");
    }
}
class ElectricalCar extends Car implements Vehicle{
    public void start(){
        System.out.println("Electrical car");
    }
}
class DieselCar extends Car implements Vehicle{
    public void start(){
        System.out.println("Disel Car");
    }
}
class PetrolCar extends Car implements Vehicle{
    public void start(){
        System.out.println("Petrol Car ");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        ElectricalCar ec = new ElectricalCar();
        System.out.println("Elevtrical car");
        ec.fuel();
        ec.start();
        System.out.println(".............");
        System.out.println("Diesel Car");
        DieselCar dc = new DieselCar();
        dc.fuel();
        dc.start();
        System.out.println(".............");
        System.out.println("Petrol Car");
        PetrolCar pc = new PetrolCar();
        pc.fuel();
        pc.start();
        System.out.println(".............");
    }
}
