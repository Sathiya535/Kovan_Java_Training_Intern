package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas.terminal_operation;

 import java.util.*;
        import java.util.stream.Collectors;

public class ListToSetExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 10, 30, 40, 20);

        Set<Integer> set = list.stream()
                .collect(Collectors.toSet());

        System.out.println("Set: " + set);
    }
}

