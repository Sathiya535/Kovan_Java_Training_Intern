package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas.streams_program;

import java.util.*;

public class SkipExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        numbers.stream()
                .skip(2)
                .forEach(System.out::println);
    }
}

