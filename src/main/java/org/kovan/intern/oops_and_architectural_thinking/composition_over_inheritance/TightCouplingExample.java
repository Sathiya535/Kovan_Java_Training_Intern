package org.kovan.intern.oops_and_architectural_thinking.composition_over_inheritance;

class Engineee {
    void start() {
        System.out.println("Engine started");
    }
}

class Carr {
    private Engineee engine = new Engineee();  // Car creates its own dependency

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class TightCouplingExample {
    public static void main(String[] args) {
        Carr car = new Carr();
        car.drive();
    }
}
