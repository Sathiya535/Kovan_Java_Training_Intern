package org.kovan.intern.Advanced_Data_and_Exceptions.exception_handling_pattern.unchacked;

public class NullPointerDemo {

    public static void main(String[] args) {

        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Object is null");
        }

        System.out.println("Program continues...");
    }
}
