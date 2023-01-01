package com.SE.FawryPhase2.Model.Refund;

import com.SE.FawryPhase2.Bsl.CreditCardBsl;
import com.SE.FawryPhase2.Model.Payment.Payment;
import com.SE.FawryPhase2.Model.Payment.Wallet;
import org.springframework.stereotype.Component;

@Component
public class User {
    private int id;
    private int WalletAmount;
    public static int Fees;
    private String email;
    private String password;
    private String username;
    private Wallet wallets;
//    private Services s;

    public User(String email,String password, String username, int id){
        this.email = email;
        this.password = password;
        this.username = username;
        //setWallets(wall);
        //Fees = Fee;
        this.id = id;

        Wallet wallets = new Wallet();

    }


    public User() {}
    public Wallet getWallets() {
        return wallets;
    }
    public void setWallets(Wallet wallets) {
        this.wallets = wallets;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public int getWalletAmount() {
        return WalletAmount;
    }
    public void setWalletAmount(int walletAmount) {
        WalletAmount = walletAmount;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public String PayAmount(Payment py) {
        return Fees+py.Pay(Fees);
    }


}