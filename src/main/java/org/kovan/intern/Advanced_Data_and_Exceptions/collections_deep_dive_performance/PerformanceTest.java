package org.kovan.intern.Advanced_Data_and_Exceptions.collections_deep_dive_performance;
import java.util.*;
public class PerformanceTest {
    public static void main(String[] args){
        int size=1000000;
        int midValue=size/2;
        // arrayList
        List<Integer> arrayList=new ArrayList<>();
        for(int i=0;i<size;i++){
            arrayList.add(i);
        }
        long startTime =System.nanoTime();
        arrayList.get(midValue);
        long endTime=System.nanoTime();
        System.out.println("ArrayList");
        System.out.println("Start Time "+startTime);
        System.out.println("Value "+arrayList.get(midValue));
        System.out.println( "End Time "+endTime);
        long arrayListDiff=endTime-startTime;
        System.out.println("Total nanosec of ArrayList "+arrayListDiff);
        System.out.println();
        System.out.println();


        //LinkedList
        List<Integer>linkedList=new LinkedList<>();
        for(int i=0;i<size;i++){
            linkedList.add(i);

        }
        startTime=System.nanoTime();
        linkedList.get(midValue);
        endTime=System.nanoTime();
        System.out.println("LinkedList");
        System.out.println("Start Time "+startTime);
        System.out.println("Value "+linkedList.get(midValue));
        System.out.println("End Time "+endTime);


        long linkedListDiff=endTime-startTime;
        System.out.println("Total sec LinkedList "+linkedListDiff);


    }
}
