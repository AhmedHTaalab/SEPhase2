package com.SE.FawryPhase2.Bsl;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.lang.String;
@Service
public class WalletBsl{

    private ArrayList<String> transactions;

    public WalletBsl() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(String transaction) {
        this.transactions.add(transaction);
    }

    public String Pay(int amount) {
        WalletBsl transactionLogic = new WalletBsl();
        transactionLogic.addTransaction("Payment of " + amount + " made using credit card");
        return "Payment of " + amount + " made using credit card";
    }

    public ArrayList<String> getTransactions() {
        return this.transactions;
    }
}