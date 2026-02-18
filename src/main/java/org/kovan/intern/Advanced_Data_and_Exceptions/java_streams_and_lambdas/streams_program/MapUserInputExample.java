package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas.streams_program;

import java.util.*;

public class MapUserInputExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many names you want to enter: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<String> names = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names.add(sc.nextLine());
        }

        // Using map() to convert to uppercase
        List<String> upperNames =
                 names.stream()
                .map(name -> name.toUpperCase())
                .toList();

        System.out.println("Uppercase Names: " + upperNames);

        sc.close(); // important to avoid memory leak
    }
}

