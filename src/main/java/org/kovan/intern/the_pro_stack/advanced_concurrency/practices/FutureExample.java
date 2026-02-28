package org.kovan.intern.the_pro_stack.advanced_concurrency.practices;
import java.util.concurrent.*;

public class FutureExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> {
            System.out.println("Calculation started...");

            Thread.sleep(3000);

            return 10 + 20;
        });
        System.out.println("Main thread is doing other work...");
        try {

            Integer result = future.get(2, TimeUnit.SECONDS);
            System.out.println("Result: " + result);

        } catch (TimeoutException e) {
            System.out.println("Task took too long! Timeout occurred.");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}