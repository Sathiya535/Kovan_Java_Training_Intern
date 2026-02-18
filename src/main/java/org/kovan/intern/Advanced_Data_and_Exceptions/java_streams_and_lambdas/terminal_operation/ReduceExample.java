package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas.terminal_operation;
import java.util.*;

public class ReduceExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum);
    }
}
