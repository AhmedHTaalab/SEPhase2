package com.SE.FawryPhase2.Model.ServiceFactory;

import org.springframework.stereotype.Component;

@Component
public class InternetPaymForm implements Form{
	private int amount;
	private String homeNumber;
//	public InternetPaymForm(String Hnum, int am) {
//		setHomeNumber(Hnum);
//		setAmount(am);
//
//	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getHomeNumber() {
		return homeNumber;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	@Override
	public String Created() {

		return "created Successfully";

	}
	
}
