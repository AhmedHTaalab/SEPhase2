package com.SE.FawryPhase2.Bsl;

import com.SE.FawryPhase2.Model.Payment.CashOnDelivery;
import com.SE.FawryPhase2.Model.Payment.CreditCard;
import com.SE.FawryPhase2.Model.Payment.Payment;
import com.SE.FawryPhase2.Model.Payment.Wallet;
import com.SE.FawryPhase2.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserBsl {



    private int Fees;
    private final ArrayList<User> usertable;
    public UserBsl() {
        this.usertable = new ArrayList<>();
    }
    public ArrayList<User> getUsertable() {
        return usertable;
    }

    public String  PayAmount1(int id) {

        Payment py = new CreditCard();
        return usertable.get(id).PayAmount(py)+"Successful";

    }
    public String  PayAmount2(int id) {

        Payment py = new Wallet();
        return usertable.get(id).PayAmount(py)+"Successful";

    }
    public String  PayAmount3(int id) {

        Payment py = new CashOnDelivery();
        return usertable.get(id).PayAmount(py)+"Successful";

    }


    public String add(User user) {
        for(User userdb : usertable){
            if(userdb.getId()== user.getId()){
                return "This user already exists";
            }
        }
         usertable.add(user);
         return "User Added";
    }

    public User getUser(int id) {
        return usertable.get(id);
    }
}
