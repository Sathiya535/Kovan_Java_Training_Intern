package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas.streams_program;

import java.util.*;

public class SortedUserInputExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers you want to enter: ");
        int n = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers.add(sc.nextInt());
        }


        List<Integer> sortedList = numbers.stream()
                .sorted()
                .toList();
        System.out.println("Sorted Numbers:");
        for(Integer i : sortedList){
            System.out.println(i);
        }

        //sortedList.forEach(num -> System.out.println(num));



        //sortedList.forEach(System.out::println);

        sc.close();
    }
}

