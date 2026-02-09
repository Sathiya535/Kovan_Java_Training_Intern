package org.kovan.intern.oops_and_architectural_thinking.composition_over_inheritance;

// Task 1

class Processor {
    private String model;

    Processor(String model) {
        this.model = model;
    }

    void process() {
        System.out.println("Processor Model : " + model);
    }
}

class Ram {
    private int sizeGB;

    Ram(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    void load() {
        System.out.println("RAM Size : " + sizeGB + "GB");
    }
}

class Storage {
    private int capacity;

    Storage(int capacity) {
        this.capacity = capacity;
    }

    void store() {
        System.out.println("Storage Capacity : " + capacity + "GB");
    }
}

class Computer {
    private Processor processor;
    private Ram ram;
    private Storage storage;

    Computer(Processor processor, Ram ram, Storage storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    void setUp() {
        System.out.println("Computer configuration....");
        processor.process();
        ram.load();
        storage.store();
        System.out.println("Computer successfully started....");
    }
}

public class PCBuilderApp {
    public static void main(String[] args) {

        Processor processor = new Processor("Intel i5");
        Ram ram = new Ram(8);
        Storage storage = new Storage(512);

        Computer computer = new Computer(processor, ram, storage);
        computer.setUp();
    }
}
