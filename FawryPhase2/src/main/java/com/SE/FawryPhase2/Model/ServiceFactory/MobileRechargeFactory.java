package com.SE.FawryPhase2.Model.ServiceFactory;

import org.springframework.stereotype.Component;

@Component
public class MobileRechargeFactory extends HandlerFactory{
private Form createdForm;
private String mobileNumber;
private int amount;
//public MobileRechargeFactory(String mobile, int am) {
//
//    this.mobileNumber = mobile;
//    this.amount = am;
//}



@Override
public Form create_Form() {

     createdForm = new MobileRechForm();
    return createdForm;
}
}
    
  