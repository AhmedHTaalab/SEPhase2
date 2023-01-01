package com.SE.FawryPhase2.Controller;

import com.SE.FawryPhase2.Bsl.CashBsl;
import com.SE.FawryPhase2.Bsl.CreditCardBsl;
import com.SE.FawryPhase2.Bsl.WalletBsl;
import com.SE.FawryPhase2.Model.Payment.CreditCard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class AdminController {

    private CreditCardBsl CreditLogic;
    private CashBsl CashLogic;
    private WalletBsl WalletLogic;

    public AdminController() {
        this.CreditLogic = new CreditCardBsl();
        this.CashLogic = new CashBsl();
        this.WalletLogic = new  WalletBsl();
    }

    @GetMapping("/Admin/CreditList")
    public ArrayList<CreditCard> getCreditCardBsl() {
        return this.CreditLogic.getcredit();
    }
//    public ArrayList<String> getCreditCardBsl() {
//        return this.CreditLogic.getTransactions();
//    }
    @GetMapping("/Admin/CashList")
    public ArrayList<String> getCashBsl() {
        return this.CashLogic.getTransactions();
    }
    @GetMapping("/Admin/WalletList")
    public ArrayList<String> getWalletBsl() {
        return this.WalletLogic.getTransactions();
    }

}
