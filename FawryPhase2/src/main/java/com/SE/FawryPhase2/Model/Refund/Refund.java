package com.SE.FawryPhase2.Model.Refund;

import com.SE.FawryPhase2.Model.Service.service;
import org.springframework.stereotype.Component;

@Component
public class Refund {
    private int amount;
    private User user;
    private com.SE.FawryPhase2.Model.Service.service service;

    private boolean isConfirmed;

    public Refund(int amount, User user, service service) {

        this.amount = amount;
        this.user = user;
        this.service = service;

    }

    public User getUser() {
        return user;
    }

    public service getService() {
        return service;
    }

    public int getAmount() {
        return amount;
    }

    public void setIsConfirmed(boolean isConfirmed){
        this.isConfirmed = isConfirmed;
    }

    public boolean getIsConfirmed(){
        return isConfirmed;
    }


}