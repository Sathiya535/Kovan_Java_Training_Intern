package org.kovan.intern.the_pro_stack.week_four_challenge;

import java.util.concurrent.locks.ReentrantLock;

public class Account {

    private final int id;
    private int balance;
    private final ReentrantLock lock = new ReentrantLock();

    public Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public ReentrantLock getLock() {
        return lock;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}
