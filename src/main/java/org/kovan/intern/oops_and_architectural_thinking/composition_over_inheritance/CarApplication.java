package org.kovan.intern.oops_and_architectural_thinking.composition_over_inheritance;
//Composition Demo code
class Engine{
    void engine(){
        System.out.println("Every car has a Engine");
    }
}
class Car{
    Engine eng=new Engine();
    void drive(){
        eng.engine();
        System.out.println("Now drive The Car");
    }
}
public class CarApplication {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
