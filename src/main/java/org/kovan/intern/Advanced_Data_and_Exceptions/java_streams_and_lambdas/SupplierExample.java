package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Double> randomValue = () -> Math.random();

        System.out.println("Random: " + randomValue.get());
    }
}

