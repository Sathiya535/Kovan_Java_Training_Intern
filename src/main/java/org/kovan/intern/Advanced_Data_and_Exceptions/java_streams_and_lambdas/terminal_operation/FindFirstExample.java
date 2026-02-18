package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas.terminal_operation;

import java.util.*;

public class FindFirstExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> first = numbers.stream()
                .findFirst();

        System.out.println(first.get());
    }
}

