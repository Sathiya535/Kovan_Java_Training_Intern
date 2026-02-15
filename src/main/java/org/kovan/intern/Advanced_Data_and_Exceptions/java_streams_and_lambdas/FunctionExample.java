package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<Integer, Integer> square = n -> n * n;

        int result = square.apply(5);

        System.out.println("Square: " + result);
    }
}

