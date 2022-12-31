package com.SE.FawryPhase2.Model.Payment;

import org.springframework.stereotype.Component;

@Component

public class Wallet implements Payment {
    public static int Wamount;


    public Wallet(int am) {
        Wamount = am;

    }


    public Wallet() {

    }

    public void setWamount(int wm){
        Wamount = wm;

    }
    public int getWamount(){
        return Wamount;

    }
    @Override
    public String Pay(int amount) {

        if(Wamount >= amount) {
            Wamount = Wamount - amount;
            return " Paid with Wallet ";

        }
        else {
            return "No enough money in the wallet";
        }

    }

    public int check_wallet_money() {

        return  Wamount;
    }



}