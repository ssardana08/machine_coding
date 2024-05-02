package com.sumit.wallet.services;

import com.sumit.wallet.dao.WalletDao;
import com.sumit.wallet.entities.Account;

public class WalletService {

    private WalletDao walletDao;
    public WalletService() {
        this.walletDao = new WalletDao();
    }

    public void createWallet(String name, double amount) {
        Account account = new Account(name, amount);
        this.walletDao.getAccountIdMapping().put(account.getId(), account);
    }

    public void getOverview() {
        for (int accountId: this.walletDao.getAccountIdMapping().keySet()) {
            System.out.printf("Account Name: %s, Balance: %f\n", this.walletDao.getAccountIdMapping().get(accountId).user().getName(), this.walletDao.getAccountIdMapping().get(accountId).getBalance());
        }
    }
}
