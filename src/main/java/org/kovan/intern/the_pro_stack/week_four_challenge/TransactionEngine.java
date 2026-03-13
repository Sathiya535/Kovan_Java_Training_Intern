package org.kovan.intern.the_pro_stack.week_four_challenge;

import java.util.List;
import java.util.Random;

public class TransactionEngine implements Runnable {

    private final List<Account> accounts;
    private final Random random = new Random();

    public TransactionEngine(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public void run() {
//Each thread performs 1000 transfers.
        //20 × 1000 = 20,000
        for (int i = 0; i < 1000; i++) {

            int fromIndex = random.nextInt(accounts.size());//Random account index & Random transfer amount
            int toIndex = random.nextInt(accounts.size());
//skip the same acc
            if (fromIndex == toIndex) continue;

            Account from = accounts.get(fromIndex);
            Account to = accounts.get(toIndex);

            int amount = random.nextInt(100);//Random amount between 0–99.

            transfer(from, to, amount);
        }
    }

    private void transfer(Account from, Account to, int amount) {

        // Deadlock prevention: lock smaller id first
//        Always lock smaller ID first
//       Then larger ID
//
//        So all threads follow same locking order.
//
//                No circular waiting → No deadlock.
        Account first = from.getId() < to.getId() ? from : to;
        Account second = from.getId() < to.getId() ? to : from;

        first.getLock().lock();
        second.getLock().lock();

        try {
            if (from.getBalance() >= amount) {
                from.withdraw(amount);
                to.deposit(amount);
            }
        } finally {
            second.getLock().unlock();
            first.getLock().unlock();
        }
    }
}