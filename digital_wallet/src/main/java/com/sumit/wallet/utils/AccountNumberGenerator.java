package com.sumit.wallet.utils;

public class AccountNumberGenerator {
    private static int accountNumber = 1;

    public static int getAccountNumber() {
        return accountNumber++;
    }
}
