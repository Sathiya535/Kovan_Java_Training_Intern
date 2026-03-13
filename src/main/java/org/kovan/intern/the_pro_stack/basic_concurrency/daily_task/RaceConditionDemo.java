package org.kovan.intern.the_pro_stack.basic_concurrency.daily_task;
class Counter {
    int count = 0;

    public void increment() {
        count++;
    }
}

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    c.increment();
                }
            });
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < 10; i++) {
            threads[i].join();
        }

        System.out.println("Final Count: " + c.count);
    }
}
