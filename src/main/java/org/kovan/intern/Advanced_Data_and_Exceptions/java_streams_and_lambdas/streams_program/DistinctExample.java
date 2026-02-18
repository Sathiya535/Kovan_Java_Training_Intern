package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas.streams_program;

import java.util.*;

public class DistinctExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 20, 40);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}

