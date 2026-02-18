package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas.streams_program;


import java.util.*;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        List<Integer> l = list.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("Final List: " + l);
    }
}

