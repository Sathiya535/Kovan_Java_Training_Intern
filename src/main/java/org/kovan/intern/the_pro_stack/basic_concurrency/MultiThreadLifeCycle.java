package org.kovan.intern.the_pro_stack.basic_concurrency;

public class MultiThreadLifeCycle {
    public static void main(String[] args){
        System.out.println("Main threas starting..");
        try{
            System.out.println("Main thread executing...");
            Thread.sleep(3000);
            System.out.println("Main Thread Executing...");
            Thread.sleep(3000);
            System.out.println("Main Thread Executing...");
            //for interuput (kill the thread)
           // Thread.currentThread().interrupt();
            Thread.sleep(3000);
            System.out.println("Main Thread Executing...");
        }
        catch(Exception e){
            System.out.println("Main Thread Interupted....");
        }
        System.out.println("Main Thread completing...");



    }
}
