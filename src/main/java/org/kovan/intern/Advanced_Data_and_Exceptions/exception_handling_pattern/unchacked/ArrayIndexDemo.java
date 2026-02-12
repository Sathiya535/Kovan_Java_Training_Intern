package org.kovan.intern.Advanced_Data_and_Exceptions.exception_handling_pattern.unchacked;

public class ArrayIndexDemo {
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        try{
            System.out.println(a[6]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }
    }
}
