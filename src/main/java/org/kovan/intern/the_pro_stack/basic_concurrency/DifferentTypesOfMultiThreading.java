package org.kovan.intern.the_pro_stack.basic_concurrency;
//JVM waits for user threads to finish.
class UserThreads extends Thread{
    public void run(){
        System.out.println("User Threads executing....");
      //  for(int i=0;i<=5;i++){
        for(int i=0;i<=5;i++){
            System.out.println("User Thread Iteration working.....");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("User Thread process Completed....");
    }
}
class DaemonThread extends Thread{
    public void run(){
        System.out.println("daemon Threads executing....");
        for(;;){
            System.out.println("Daemon Thread Iteration working.....");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        //Unreached Statement
       /// System.out.println("Daemon Thread process Completed....");
    }


}


public class DifferentTypesOfMultiThreading {
    public static void main(String[] args) {
        UserThreads u=new UserThreads();
        u.start();

        DaemonThread d=new DaemonThread();
        d.setDaemon(true);
        d.start();

    }
}
