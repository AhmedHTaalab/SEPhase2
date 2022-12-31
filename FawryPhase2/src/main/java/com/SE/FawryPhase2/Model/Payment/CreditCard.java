package com.SE.FawryPhase2.Model.Payment;

import org.springframework.stereotype.Component;
import java.lang.String;


@Component
public class CreditCard implements Payment {

    private String card;
    private String cvv;
    private String date;
    private int id;

//    public CreditCard(String cN, String cv, String date) {
//     this.cardNumber=cN;
//     this.cvv = cv;
//     this.dateOfExpiry = date;
//    }

    public String getCardNumber() {
        return card;
    }
    public void setCardNumber(String cardNumber) {
        this.card = cardNumber;
    }
    public String getDateOfExpiry() {
        return date;
    }
    public void setDateOfExpiry(String dateOfExpiry) {
        this.date = dateOfExpiry;
    }
    public String getCvv() {
        return cvv;
    }
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    public int getId(){return id;}
    public void setId(int id){this.id=id;}
    @Override
    public String Pay(int amount) {

        return  " paid with Credit Card ";
    }







}