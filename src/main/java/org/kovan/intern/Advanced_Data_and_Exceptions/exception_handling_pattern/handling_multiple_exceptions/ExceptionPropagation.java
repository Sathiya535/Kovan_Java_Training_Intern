package org.kovan.intern.Advanced_Data_and_Exceptions.exception_handling_pattern.handling_multiple_exceptions;

public class ExceptionPropagation {
    static void method1(){
        int n=12/0;

    }
    static void method2(){
        method1();

    }
    static  void method3(){
        try{
            method2();

        }
        catch(Exception e){
            System.out.println("Exception");

        }

    }
    public  static void main(String[] args){
        method3();
//        method2();
//        method3();

    }
}
