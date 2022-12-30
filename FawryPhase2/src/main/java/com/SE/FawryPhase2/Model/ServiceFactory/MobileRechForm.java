package com.SE.FawryPhase2.Model.ServiceFactory;

import org.springframework.stereotype.Component;

@Component
public class MobileRechForm implements Form {
	private int amount;
	private String mobileNumber;

//	public MobileRechForm(String num, int am) {
//		setAmount(am);
//		setMobileNumber(num);
//	}
	
	
	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public String Created() {

		return "created Successfully";

	}

}
