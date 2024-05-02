package com.sumit.wallet.entities;

public class Transaction {

    private int fromAccountId;
    private int toAccountId;
    private double amount;
    private int epochTime;

    public Transaction(int fromAccountId, int toAccountId, double amount, int epochTime) {
        this.fromAccountId = fromAccountId;
        this.toAccountId = toAccountId;
        this.amount = amount;
        this.epochTime = epochTime;
    }
}
