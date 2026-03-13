package org.kovan.intern.Advanced_Data_and_Exceptions.exception_handling_pattern.unchacked;

public class ArithmeticDemo {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues...");
    }
}
