package com.SE.FawryPhase2.Bsl;

import com.SE.FawryPhase2.Model.Payment.Payment;
import com.SE.FawryPhase2.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserBsl {


    private int Fees;
    private final List<User> usertable;
    public UserBsl() {
        this.usertable = new ArrayList<>();
    }
    public List<User> getUsertable() {
        return usertable;
    }

    public void PayAmount(Payment py) {
        py.Pay(Fees);
    }




}
