package com.SE.FawryPhase2.Model.Payment;

import org.springframework.stereotype.Component;
import java.lang.String;


@Component
public class CreditCard implements Payment {

    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

//    public CreditCard(String cN, String cv, String date) {
//     this.cardNumber=cN;
//     this.cvv = cv;
//     this.dateOfExpiry = date;
//    }

    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    public String getDateOfExpiry() {
        return dateOfExpiry;
    }
    public void setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }
    public String getCvv() {
        return cvv;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    @Override
    public String Pay(int amount) {

        return  " paid with Credit Card";
    }







}