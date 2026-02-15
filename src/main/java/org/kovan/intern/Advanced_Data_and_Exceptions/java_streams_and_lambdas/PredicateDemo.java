package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args){
        //Functional Interface
        //Predicator --Boolean values
        //Predicate = condition checker
        Predicate<String> predicator=str->str.length()>5;
        //FunctionalInterface<Input Type>name=(parameterTyep)->condition;
        System.out.println(predicator.test("Helloo"));//true
        System.out.println("Hello");//false

    }
}
