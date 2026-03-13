package org.kovan.intern.the_pro_stack.week_four_challenge;

import java.util.ArrayList;
import java.util.List;

public class BankSimulation {

    public static void main(String[] args) throws InterruptedException {

        List<Account> accounts = new ArrayList<>();

        // Create 100 accounts with $1000
        for (int i = 0; i < 100; i++) {
            accounts.add(new Account(i, 1000));
        }

        int initialTotal = calculateTotal(accounts);
        System.out.println("Initial Total: " + initialTotal);

        List<Thread> threads = new ArrayList<>();

        // Create 20 threads
        for (int i = 0; i < 20; i++) {
            Thread t = new Thread(new TransactionEngine(accounts));
            threads.add(t);
            t.start();
        }


        // Wait for all threads to finish
        for (Thread t : threads) {
            t.join();
        }

        int finalTotal = calculateTotal(accounts);
        System.out.println("Final Total: " + finalTotal);
    }

    private static int calculateTotal(List<Account> accounts) {
        return accounts.stream()
                .mapToInt(Account::getBalance)
                .sum();
    }
}
