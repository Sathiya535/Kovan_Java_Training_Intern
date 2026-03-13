package org.kovan.intern.Advanced_Data_and_Exceptions.exception_handling_pattern.checked_exceptions;

public class ClassNotFoundExceptionDemo {
    public static void main(String[] args){
        try{
            Class.forName("TextName");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found");

        }
    }
}
