package com.SE.FawryPhase2.Model.ServiceFactory;
import org.springframework.stereotype.Component;

import java.lang.String;
@Component
public class DonationsForm implements Form{
	private String charity;
	private int amount;
	
//	public DonationsForm(String charit, int am) {
//		setCharity(charit);
//		setAmount(am);
//
//	}

	public String getCharity() {
		return charity;
	}

	public void setCharity(String charity) {
		this.charity = charity;
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
