package com.SE.FawryPhase2.Controller;

import com.SE.FawryPhase2.Bsl.CreditCardBsl;
import com.SE.FawryPhase2.Model.Payment.CreditCard;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardController {

    private CreditCardBsl creditbsl;

    public CreditCardController(CreditCardBsl creditbsl) {

        this.creditbsl = creditbsl;

    }

    public CreditCardBsl getcreditbsl() {
        return creditbsl;
    }

    public void setcreditbsl(CreditCardBsl creditbsl) {
        this.creditbsl = creditbsl;
    }

    @PostMapping(value = "/CreditCard")
    public  String AddCredit(@RequestBody CreditCard credit){
        return creditbsl.addCreditCard(credit);
    }


}
