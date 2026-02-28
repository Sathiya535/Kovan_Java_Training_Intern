package org.kovan.intern.the_pro_stack.advanced_concurrency.practices;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            final int taskNumber = i;
            pool.submit(() -> {
                System.out.println("Task " + taskNumber +
                        " executed by " + Thread.currentThread().getName());
            });
        }

        pool.shutdown(); //shutdownNow() Attempts to stop all running tasks immediately (may interrupt).
    }
}