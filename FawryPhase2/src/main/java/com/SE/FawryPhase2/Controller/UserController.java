package com.SE.FawryPhase2.Controller;

import com.SE.FawryPhase2.Bsl.CreditCardBsl;
import com.SE.FawryPhase2.Bsl.UserBsl;
import com.SE.FawryPhase2.Model.Payment.Wallet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/")
public class UserController {

    private UserBsl userbsl;

    public UserController(UserBsl userbsl) {

        this.userbsl = userbsl;

    }

    public UserBsl getUserbsl() {
        return userbsl;
    }

    public void setUserbsl(UserBsl userbsl) {
        this.userbsl = userbsl;
    }



    public void InsertInWallet(CreditCardBsl cc, int WalletAmount) {

        cc.insertInWallet(WalletAmount);
    }
    public void check_wallet_money(Wallet wallets) {

        wallets.check_wallet_money();
    }

   @GetMapping("test")
    public String Test() {
        return "Test";
    }
}