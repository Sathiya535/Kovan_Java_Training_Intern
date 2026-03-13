package org.kovan.intern.the_pro_stack.basic_concurrency;

class Testt extends Thread{
    public void run(){
       Thread t = Thread.currentThread();
       String name=t.getName();
       if(name.equals("ADD")){
           addition();
       }
       else if(name.equals("CHAR")){
           printChar();
       }
       else{
           printNum();
       }


    }
    public void addition(){
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
    public void printChar(){
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
    public void printNum(){
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

public class MutiThreadingUsingSingleRun {
    public static void main(String[] args){
        Testt t1=new Testt();
        Testt t2=new Testt();
        Testt t3=new Testt();
        t1.setName("ADD");
        t2.setName("CHAR");
        t3.setName("NUM");

        t1.start();
        t2.start();
        t3.start();



    }
}
