package com.sumit.wallet.dao;

import com.sumit.wallet.entities.Account;

import java.util.HashMap;
import java.util.Map;

public class WalletDao {
    private Map<Integer, Account> accountIdMapping;

    public WalletDao() {
        this.accountIdMapping = new HashMap<>();
    }

    public Map<Integer, Account> getAccountIdMapping() {
        return this.accountIdMapping;
    }
}
