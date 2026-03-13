package org.kovan.intern.Advanced_Data_and_Exceptions.generics_and_wildcards;
import org.kovan.intern.oops_and_architectural_thinking.Inheritance_and_Polymorphism.SingleInheritance;

import java.util.*;

public class TestSum {
    public static double wildCardSum(List<? extends Number>list){
        double sum=0;
        for(Number i:list){
            sum+=i.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args){
        List<Integer>intlist=Arrays.asList(10,20,30,40,50);
        List<Short> shortlist = Arrays.asList(Short.valueOf((short)10), Short.valueOf((short)2));
        List<Byte>byteList=Arrays.asList(Byte.valueOf((byte)1),Byte.valueOf((byte)2),Byte.valueOf((byte)3),Byte.valueOf((byte)4),Byte.valueOf((byte)1));
        List<Double>doubleList=Arrays.asList(10.2,10.3,10.4,10.5);
        System.out.println("Integer "+wildCardSum(intlist));
        System.out.println("Double "+wildCardSum(doubleList));
        System.out.println("Short "+wildCardSum(shortlist));
        System.out.println("Byte "+wildCardSum(byteList));
    }
}
