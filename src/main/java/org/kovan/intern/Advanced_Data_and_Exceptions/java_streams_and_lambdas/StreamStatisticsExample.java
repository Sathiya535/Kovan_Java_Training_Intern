package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas;

import java.util.*;
import java.util.stream.*;

public class StreamStatisticsExample {

    public static void main(String[] args) {

        // Generate 100 random integers
        List<Integer> numbers = new Random()
                .ints(100, 1, 1000)   // 100 numbers between 1 and 1000
                .boxed()
                .collect(Collectors.toList());

        // Single pass statistics
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Average: " + stats.getAverage());
    }
}

