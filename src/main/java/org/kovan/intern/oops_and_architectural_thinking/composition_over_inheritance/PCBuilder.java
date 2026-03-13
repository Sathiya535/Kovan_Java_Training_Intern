package org.kovan.intern.oops_and_architectural_thinking.composition_over_inheritance;

class Processors {
    String model;

    Processors(String model) {
        this.model = model;
    }

    void show() {
        System.out.println("Processor: " + model);
    }
}
class Rams {
    int capacity; // in GB

    Rams(int capacity) {
        this.capacity = capacity;
    }

    void show() {
        System.out.println("RAM: " + capacity + " GB");
    }
}
class Storages {
    int capacity; // in GB

    Storages(int capacity) {
        this.capacity = capacity;
    }

    void show() {
        System.out.println("Storage: " + capacity + " GB");
    }
}
class Computers {

    Processors processor;
    Rams ram;
    Storages storage;

    Computers(Processors processor, Rams ram, Storages storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    // Upgrade RAM (swap part)
    void upgradeRam(Rams newRam) {
        this.ram = newRam;
        System.out.println("RAM upgraded successfully!");
    }

    void showConfig() {
        processor.show();
        ram.show();
        storage.show();
    }
}
public class PCBuilder {
    public static void main(String[] args) {

        Processors p = new Processors("Intel i5");
        Rams r = new Rams(8);
        Storages s = new Storages(512);

        Computers pc = new Computers(p, r, s);

        System.out.println("Initial Configuration:");
        pc.showConfig();

        // Upgrade RAM
        Rams newRam = new Rams(16);
        pc.upgradeRam(newRam);

        System.out.println("After RAM Upgrade:");
        pc.showConfig();
    }
}
