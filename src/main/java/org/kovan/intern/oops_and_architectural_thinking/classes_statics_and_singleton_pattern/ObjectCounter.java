package org.kovan.intern.oops_and_architectural_thinking.classes_statics_and_singleton_pattern;

public class ObjectCounter {

    // Step 1: static counter (shared by all objects)
    static int count = 0;

    // Step 2: constructor
    ObjectCounter() {
        count++;   // increase count when object is created
    }

    public static void main(String[] args) {

        // creating objects
        new ObjectCounter();
        new ObjectCounter();
        new ObjectCounter();

        // Step 3: print count using class name
        System.out.println("Total objects created: " + ObjectCounter.count);
    }
}
