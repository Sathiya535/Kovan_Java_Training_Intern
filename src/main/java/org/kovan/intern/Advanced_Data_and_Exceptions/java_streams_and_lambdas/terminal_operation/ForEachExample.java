package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas.terminal_operation;

import java.util.*;

public class ForEachExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30);

        list.stream()
                .forEach(System.out::println);
    }
}
