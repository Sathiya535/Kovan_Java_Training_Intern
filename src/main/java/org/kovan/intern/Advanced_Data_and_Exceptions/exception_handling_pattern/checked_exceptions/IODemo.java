package org.kovan.intern.Advanced_Data_and_Exceptions.exception_handling_pattern.checked_exceptions;

import java.io.*;

public class IODemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
        } catch (IOException e) {
            System.out.println("IO Exception occurred");
        }
    }
}

