package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas.streams_program;
import java.util.List;

public class AllStreamsProgram {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        List<String> names = List.of("sathiyaa", "priya","Harshini","Kaliki","Arjun");
        List<Integer> salary = List.of(300000,200000,100000,2000,1000,4000,3000000);
        Solutions sum = new Solutions();
        sum.sumOfNumbers(numbers);
        sum.evenNumbers(numbers);
        sum.oddnumbers(numbers);
        sum.howManyElements(numbers);
        sum.letterStarting(names);
        sum.groupElements(names);
        sum.upperCase(names);
        sum.greater(numbers);
        sum.maximum(numbers);
        sum.minimum(numbers);
        sum.duplicates(numbers);
        sum.ascending(numbers);
        sum.descending(numbers);
        sum.lengthOfString(names);
        sum.squareOfEach(numbers);
        sum.lengthLessFive(names);
        sum.oddNumbers(numbers);
        sum.multiplyByTwo(numbers);
        sum.findFirst(numbers);
        sum.firstFive(numbers);
        sum.skipThree(numbers);
        sum.salary(salary);
        sum.secondHighest(numbers);
        sum.howManyElementsHaveMoreThan(names);
        sum.longestName(names);





    }
}

