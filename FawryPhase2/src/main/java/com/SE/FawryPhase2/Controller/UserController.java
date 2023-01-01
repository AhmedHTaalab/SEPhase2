package com.SE.FawryPhase2.Controller;

import com.SE.FawryPhase2.Bsl.CreditCardBsl;
import com.SE.FawryPhase2.Bsl.UserBsl;
import com.SE.FawryPhase2.Model.Payment.Wallet;
import com.SE.FawryPhase2.Model.Refund.User;
import org.springframework.web.bind.annotation.*;

@RestController
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


//    @GetMapping("/user/Insert")
//    public int InsertInWallet(@RequestParam (value = "Credit", required = false) CreditCardBsl Credit,@RequestParam("Amount") int Amount) {
//
//        return Credit.insertInWallet(Amount);
//    }

    @PostMapping("/user/Insert")
    public int InsertInWallet(@RequestBody CreditCardBsl Credit,@RequestBody int Amount) {

        return Credit.insertInWallet(Amount);
    }
    @GetMapping("/user/Wallet")
    public int check_wallet_money(Wallet wallets) {

        return wallets.check_wallet_money();
    }
    @PostMapping(value = "/user")
    public  String AddUser(@RequestBody User user){
        return userbsl.add(user);
    }
    @GetMapping(value = "/user/{id}/payCredit")
    public String UserPayment1(@PathVariable("id") int id) {
        return userbsl.PayAmount1(id);
    }
    @GetMapping(value = "/user/{id}/payWallet")
    public String UserPayment2(@PathVariable("id") int id) {
        return userbsl.PayAmount2(id);
    }
    @GetMapping(value = "/user/{id}/payCash")
    public String UserPayment3(@PathVariable("id") int id) {
        return userbsl.PayAmount3(id);
    }
    @GetMapping(value = "/user/{id}")
    public User getUser(@PathVariable("id") int id){
        return userbsl.getUser(id);
    }

}