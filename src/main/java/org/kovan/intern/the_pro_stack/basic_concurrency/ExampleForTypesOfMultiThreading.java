package org.kovan.intern.the_pro_stack.basic_concurrency;

class Keyboard extends Thread{
    public void run(){
        System.out.println("Keyboard class is running....");
        for(int i=1;i<=5;i++){
            System.out.println("KeyBoard...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Keyboard program ended...");
    }

}
class Compiler extends Thread{
    public void run(){
        System.out.println("Compiler class is running....");
       // for(int i=1;i<=5;i++){
        for(;;){
            System.out.println("Compiler...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
       // System.out.println("Compiler program ended...");
    }

}
class Saving extends Thread{
    public void run(){
        System.out.println("Saving class is running....");
        //for(int i=1;i<=5;i++){
        for(;;){
            System.out.println("Saving...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //System.out.println("KSaving program ended...");
    }

}
public class ExampleForTypesOfMultiThreading {
    public static void main(String[] args){
        Keyboard k=new Keyboard();
        k.start();


        Compiler c=new Compiler();
        c.setDaemon(true);
        c.start();


        Saving s=new Saving();
        s.setDaemon(true);
        s.start();
    }
}
