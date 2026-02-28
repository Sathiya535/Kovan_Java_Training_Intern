package org.kovan.intern.the_pro_stack.advanced_concurrency.practices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

    int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }


    public void run() {
        System.out.println("Task " + taskId +
                " started by " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000); // each task -> 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Task " + taskId + " finished");
    }
}

public class FixedThreadPoolDemo {
    public static void main(String[] args) {
                                                            //size 3
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            pool.execute(new Task(i));
        }

        pool.shutdown();
    }
}
