package org.kovan.intern.Advanced_Data_and_Exceptions.exception_handling_pattern.checked_exceptions;

import java.io.*;

public class FileNotFoundDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
