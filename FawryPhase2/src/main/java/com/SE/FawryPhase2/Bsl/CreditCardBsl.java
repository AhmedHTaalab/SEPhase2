package com.SE.FawryPhase2.Bsl;

import com.SE.FawryPhase2.Model.Payment.CreditCard;
import com.SE.FawryPhase2.Model.Payment.Wallet;
import com.SE.FawryPhase2.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.lang.String;

@Service
public class CreditCardBsl {

    private ArrayList<CreditCard> credittable;

    public CreditCardBsl() {
        this.credittable = new ArrayList<>();
    }
    public String addCreditCard(CreditCard credit) {

        credittable.add(credit);
        return "Card Added";
    }

    public ArrayList<CreditCard> getcredit() {
        return this.credittable;
    }
    public int insertInWallet(int Wamount) {

        new Wallet(Wamount);
        return Wamount ;

    }



}
