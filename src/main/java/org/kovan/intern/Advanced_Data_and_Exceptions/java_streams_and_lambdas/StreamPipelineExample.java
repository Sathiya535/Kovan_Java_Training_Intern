package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas;

import java.util.*;
import java.util.stream.*;

public class StreamPipelineExample {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        numbers.stream()                 // 1️Source
                .filter(n -> n > 20)      // 2 Intermediate
                .map(n -> n * 2)          // 2️Intermediate
                .forEach(System.out::println);  // 3️Terminal
    }
}

