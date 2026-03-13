package org.kovan.intern.the_pro_stack.basic_concurrency;

import java.util.Scanner;
class Test1 extends Thread{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a :");
        int a=sc.nextInt();
        System.out.println("Enter b :");
        int b=sc.nextInt();
        System.out.println("Answer");
        System.out.println(a+b);
        System.out.println("Adding Program Ended...");
    }

}
class Test2 extends Thread{
    @Override
    public void run(){
        for(int i='a';i<='k';i++){
            System.out.println((char)i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Char Printing Ended...");

            }
}
class Test3 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<=10;i++ ){
            System.out.println(i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Printing number also Ended....");

    }
}

public class MultiThreadingUsingExtends {
    public static void main(String[] args){
        Test1 t1=new Test1();
        Test2 t2=new Test2();
        Test3 t3=new Test3();
        t1.start();
        t2.start();
        t3.start();





    }
}
