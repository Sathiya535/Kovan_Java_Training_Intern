package org.kovan.intern.Advanced_Data_and_Exceptions.java_streams_and_lambdas;
interface Enginee{
    void start();
}
public class Functional_Interface {

    public static void main(String[] args){


        //Anonymous Inner Class
//        Enginee e=new Enginee(){
//             public void start(){
//                System.out.println("Starting....");
//
//            }
//        };
//        e.start();



        //Lambda Class

        Enginee e=()->{
            System.out.println("Starting....");
        };
        e.start();

    }
}
