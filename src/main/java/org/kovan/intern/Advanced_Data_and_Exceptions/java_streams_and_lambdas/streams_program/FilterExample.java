package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas.streams_program;

import java.util.*;

public class FilterExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();

        System.out.println(evenNumbers);
    }
}
