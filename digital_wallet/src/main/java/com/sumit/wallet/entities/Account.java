package com.sumit.wallet.entities;

import com.sumit.wallet.utils.AccountNumberGenerator;

public class Account {

    private User user;
    private double balance;
    private int id;

    public Account(String name, double balance) {
        this.user = new User(name);
        this.balance = balance;
        this.id = AccountNumberGenerator.getAccountNumber();
    }

    public int getId() {
        return this.id;
    }

    public User user() {
        return this.user;
    }

    public double getBalance() {
        return balance;
    }
}
