package com.SE.FawryPhase2.Bsl;

import com.SE.FawryPhase2.Model.Payment.Wallet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.lang.String;

@Service
public class CreditCardBsl {

    private ArrayList<String> transactions;

    public CreditCardBsl() {
        this.transactions = new ArrayList<>();
    }
    public void addTransaction(String transaction) {
        this.transactions.add(transaction);
    }
    public String Pay(int amount) {
        CreditCardBsl transactionLogic = new CreditCardBsl();
        transactionLogic.addTransaction("Payment of " + amount + " made using credit card");
        return "Payment of " + amount + " made using credit card";
    }
    public ArrayList<String> getTransactions() {
        return this.transactions;
    }
    public String insertInWallet(int Wamount) {

        new Wallet(Wamount);

        return Wamount + "Inserted in Wallet";

    }



}
