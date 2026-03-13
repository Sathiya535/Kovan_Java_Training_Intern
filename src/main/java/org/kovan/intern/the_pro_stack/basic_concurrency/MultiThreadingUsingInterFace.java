package org.kovan.intern.the_pro_stack.basic_concurrency;



import java.util.Scanner;
class Test11 implements Runnable{
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
class Test22 implements Runnable{
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
class Test33 implements Runnable{
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

public class MultiThreadingUsingInterFace{
    public static void main(String[] args){
        Test11 t1=new Test11();
        Test22 t2=new Test22();
        Test33 t3=new Test33();
//        t1.start();
//        t2.start();
//        t3.start();
        Thread th1=new Thread(t1);
        Thread th2=new Thread(t2);
        Thread th3=new Thread(t3);
        th1.start();
        th2.start();
        th3.start();





    }
}

