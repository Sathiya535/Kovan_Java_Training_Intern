package org.kovan.intern.Advanced_Data_and_Exceptions.exception_handling_pattern.unchacked;

public class ClassCastDemo {

    public static void main(String[] args) {

        try {
            Object obj = "Hello";
            Integer num = (Integer) obj;   // Wrong casting
        } catch (ClassCastException e) {
            System.out.println("Invalid type casting");
        }

        System.out.println("Program continues...");
    }
}
