package org.kovan.intern.Advanced_Data_and_Exceptions.exception_handling_pattern;

public class StackTraceDemo {

    public static void main(String[] args) {
        System.out.println("Program started");
        methodA();
        System.out.println("Program ended");
    }

    public static void methodA() {
        System.out.println("Inside methodA");
        methodB();
    }

    public static void methodB() {
        System.out.println("Inside methodB");
        int result = 10 / 0;   // Exception occurs here
        System.out.println(result);
    }
}

