package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas;

import java.util.*;
import java.util.stream.*;

public class LazyExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30);

        list.stream()
                .filter(n -> {
                    System.out.println("Filtering: " + n);
                    return n > 10;
                });
    }
}
