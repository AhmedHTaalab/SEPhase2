package com.SE.FawryPhase2.Model.Payment;

import org.springframework.stereotype.Component;

@Component
public class CashOnDelivery implements Payment{



    @Override
    public String Pay(int amount) {
        return " paid with Cash";
    }

}
