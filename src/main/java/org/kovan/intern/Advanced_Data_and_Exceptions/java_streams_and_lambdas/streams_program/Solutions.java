package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas.streams_program;

import java.util.Comparator;
import java.util.List;

public class Solutions {

    public void sumOfNumbers(List<Integer> numbers) {

        int sum = numbers.stream().
                mapToInt(x -> x)
                .sum();
        System.out.println("sum of all number in the list : " + sum);
        System.out.println();
        System.out.println("---------------------------------------");

    }

    public void evenNumbers(List<Integer> numbers) {
        int[] arr = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .toArray();
        System.out.print("even numbers in the list : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------");
        //System.out.println();
    }

    public void oddnumbers(List<Integer> numbers) {
        int arr[] = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(n -> n)
                .toArray();
        System.out.print("odd numbers in the list : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
    }

    public void howManyElements(List<Integer> numbers) {
        long count = numbers.stream()
                .count();

        System.out.println("how many elements in the list : " + count);
        System.out.println("---------------------------------------");
    }

    public void letterStarting(List<String> names) {

        String[] arr = names.stream()
                .filter(s -> s.toUpperCase().startsWith("A"))
                .toArray(size -> new String[size]);
        System.out.print("letter starting with A in the list : ");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------");


    }

    public void groupElements(List<String> names) {

        String[] arr = names.stream()
                .filter(s -> s.length() > 3)
                .toArray(size -> new String[size]);
        System.out.print("group elements in the list : ");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
    }

    public void upperCase(List<String> names) {
        String[] arr = names.stream()
                .map(s -> s.toUpperCase())
                .toArray(size -> new String[size]);

        System.out.print("upper case in the list : ");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------");
    }

    public void greater(List<Integer> numbers) {
        int[] arr = numbers.stream()
                .filter(s -> s > 10)
                .mapToInt(n -> n)
                .toArray();
        System.out.print("greater in the list : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------");


    }

    public void maximum(List<Integer> numbers) {
        int max = numbers.stream()
                .max(Integer::compareTo)//max((a, b) -> a.compareTo(b))
                .get();

        System.out.println("max in the list : " + max);
        System.out.println("---------------------------------------");

    }

    public void minimum(List<Integer> numbers) {
        int min = numbers.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println("min in the list : " + min);
        System.out.println("---------------------------------------");

    }

    public void duplicates(List<Integer> numbers) {

        int[] arr = numbers.stream()
                .distinct()
                .mapToInt(n -> n)
                .toArray();

        System.out.print("duplicates in the list : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------");
    }


    public void ascending(List<Integer> numbers) {

        int[] arr = numbers.stream()
                .sorted()
                .mapToInt(n -> n)
                .toArray();
        System.out.print("ascending in the list : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------");
    }


    public void descending(List<Integer> numbers) {
        int[] arr = numbers.stream()
                .sorted(Comparator.reverseOrder())//for sort ->default it is asc and if we want na using the classComparator we can reverse
                .mapToInt(n -> n)
                .toArray();
        System.out.print("descending in the list : ");
        for (int n : arr) {
            System.out.print(n + " ");

        }
        System.out.println();

        System.out.println("---------------------------------------");
    }

    public void lengthOfString(List<String> names) {

        int[] arr = names.stream()
                .mapToInt(n -> n.length())
                .toArray();
        System.out.print("length of the string in the list : ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------");
    }

    public void squareOfEach(List<Integer> numbers) {

        List<Integer> square = numbers.stream()
                .map(n -> n * n)
                .toList();
        System.out.println("Square of elements in the list : " + square);
        System.out.println("---------------------------------------");
    }

    public void oddNumbers(List<Integer> numbers) {
        List<Integer> odd = numbers.stream()
                .filter(n -> n % 2 != 0)
                .toList();
        System.out.println("odd numbers in the list : " + odd);
        System.out.println("---------------------------------------");
    }

    public void lengthLessFive(List<String> names) {
        List<String> name = names.stream()
                .filter(s -> s.length() <5)
                .toList();
        System.out.println("lengthh less five in the list : " + name);
        System.out.println("---------------------------------------");
    }

    public void multiplyByTwo(List<Integer> numbers) {
        List<Integer> number = numbers.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println("multiply by 2 in the list : " + number);
        System.out.println("---------------------------------------");
    }

    public void findFirst(List<Integer> numbers) {
        int num = numbers.stream()
                .filter(n -> n > 10)
                .findFirst()
                .orElse(-1);

        System.out.println("find first in the list : " + num);
        System.out.println("---------------------------------------");
    }

    public void positiveOrNot(List<Integer> numbers) {
         boolean allPositive = numbers.stream()
            .allMatch(n -> n > 0);


       System.out.println("positive or not in the list : " + allPositive);



    }

    public void divideByfive(List<Integer> numbers) {
        List<Integer> number = numbers.stream()
                .filter(n-> n%5 ==0)
                .toList();

        System.out.println("divide by five in the list : " + number);
        System.out.println("---------------------------------------");
    }

    public void findAny(List<Integer> numbers) {
        int number = numbers.stream()
                .filter(n -> n > 10)
                .findAny()
                .get();

        System.out.println("find any in the list : " + number);
        System.out.println("---------------------------------------");
    }

    public void firstFive (List<Integer> numbers) {
        List <Integer> number = numbers.stream().limit(5)

                .toList();
        System.out.println("first five in the list : " + number);
        System.out.println("---------------------------------------");

    }
    public void skipThree(List<Integer> numbers) {
        List<Integer> number = numbers.stream()
                .skip(3)
                .toList();
        System.out.println("skip three in the list : " + number);
        System.out.println("---------------------------------------");
    }

    public void salary(List<Integer> numbers) {
        List<Integer> salaries = numbers.stream()
                .filter(n -> n > 30000)
                .sorted()
                .toList();

        System.out.println("salary in the list : " + salaries);
        System.out.println("---------------------------------------");
    }

    public void secondHighest(List<Integer> numbers){

        int num = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        System.out.println("second highest in the list : " + num);
        System.out.println("---------------------------------------");

    }

    public void howManyElementsHaveMoreThan(List<String> names){

        long count = names.stream()
                .filter(n -> n.length()>4)
                .count();

        System.out.println("how many elements have more than 4 in the list : " + count);
        System.out.println("---------------------------------------");


    }

    public void longestName(List<String> names){
        String s = names.stream()
                .max(Comparator.comparingInt(n -> n.length()))
                .get();
        System.out.println("longest name in the list : " + s);
        System.out.println("---------------------------------------");
    }


}
