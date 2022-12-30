package com.SE.FawryPhase2.Model.ServiceFactory;

import org.springframework.stereotype.Component;

@Component
public class LandlineForm implements Form {
	private String homeNumber;
	private int amount;
	
//	public LandlineForm(String Hnum, int am) {
//		setHomeNumber(Hnum);
//		setAmount(am);
//	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String Created() {

		return "created Successfully";

	}

}
