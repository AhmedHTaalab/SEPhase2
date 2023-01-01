package com.SE.FawryPhase2.Bsl;

import com.SE.FawryPhase2.Model.Refund.Admin;
import com.SE.FawryPhase2.Model.Service.service;
import com.SE.FawryPhase2.Model.Refund.User;
import org.springframework.stereotype.Service;
import com.SE.FawryPhase2.Model.Refund.Refund;

import java.util.ArrayList;
import java.util.List;

@Service
public class RefundBsl{
    private Refund refund;
    private List<Admin> admins = new ArrayList<>();

//    //public RefundBsl(int amount, User user, service service){
//        refund = new Refund(amount, user, service);
//    }
//    public RefundBsl(Refund refund){
//        this.refund = refund;
//    }
//    public void addAdmin(String name, int Id, String email) {
//        admins.add(new Admin(name, Id, email));
//    }

    public void requestRefund(RefundBsl refundbsl) {
        this.refund = refundbsl.getRefund();
        notifyAdmins(refundbsl);
    }

    public void refundConfirmation(boolean isConfirmed) {
        if (isConfirmed) {
            refund.setIsConfirmed(true);
            refund.getUser().setWalletAmount(refund.getUser().getWalletAmount() + refund.getAmount());
        } else {
            refund.setIsConfirmed(false);
        }
    }

    private void notifyAdmins(RefundBsl refundbsl) {
        for (Admin admin : admins) {
            admin.confirmRefund(refundbsl);
        }
    }

    public Refund getRefund() {
        return refund;
    }
}

