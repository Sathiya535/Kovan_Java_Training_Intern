package org.kovan.intern.Advanced_Data_and_Exceptions.exception_handling_pattern.handling_multiple_exceptions;

public class ThrowThrowsExample {
    public static void  checkAge(int age)throws Exception{
        if(age<0){
            throw new Exception();

        }
        System.out.println("Your Age is "+age);
    }
    public static void main(String[] args)throws Exception{
        int age=-5;
        checkAge(age);

        }
}
