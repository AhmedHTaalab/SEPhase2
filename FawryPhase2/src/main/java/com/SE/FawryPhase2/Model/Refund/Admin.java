package com.SE.FawryPhase2.Model.Refund;

import com.SE.FawryPhase2.Bsl.RefundBsl;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@Component
public class Admin {
    private String name;
    private int id;
    private String email;

//    public Admin(String name, int id, String email) {
//        this.name = name;
//        this.id = id;
//        this.email = email;
//    }

    public void confirmRefund(RefundBsl refundbsl) {
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("Yes")) {
            refundbsl.refundConfirmation(true);
        } else {
            refundbsl.refundConfirmation(false);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
