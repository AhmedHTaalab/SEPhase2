package com.SE.FawryPhase2.Controller;

import com.SE.FawryPhase2.Model.Payment.Payment;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentCntroller {
    public int amount;

    public void PayAmount(Payment py) {
        py.Pay(amount);
    }

}
