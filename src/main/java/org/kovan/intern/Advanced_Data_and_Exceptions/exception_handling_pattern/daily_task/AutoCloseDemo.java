package org.kovan.intern.Advanced_Data_and_Exceptions.exception_handling_pattern.daily_task;

class Resource implements AutoCloseable {

    public Resource() {
        System.out.println("Resource opened");
    }

    public void doWork() {
        System.out.println("Working...");
        int a = 10 / 0;   // Force exception
    }

    @Override
    public void close() {
        System.out.println("Resource closed automatically");
    }
}

public class AutoCloseDemo {

    public static void main(String[] args) {

        try (Resource r = new Resource()) {

            r.doWork();   // Exception happens here

        } catch (Exception e) {
            System.out.println("Exception caught");
        }

        System.out.println("Program continues...");
    }
}
