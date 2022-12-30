package com.SE.FawryPhase2.Model.ServiceFactory;

import org.springframework.stereotype.Component;

@Component
public class InternetPaymFactory extends HandlerFactory{
	private Form createdForm;
	private String homeNumber;
	private int amount;

//	public InternetPaymFactory(String homNumber, int am) {
//
//	    this.setHomeNumber(homNumber);
//	    this.amount = am;
//	}
//
	
	public String getHomeNumber() {
		return homeNumber;
	}


	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	@Override
	public  Form create_Form(){

	     createdForm = new InternetPaymForm();
	    return createdForm;
	    
	    }


	
}
