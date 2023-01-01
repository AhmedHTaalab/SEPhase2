package com.SE.FawryPhase2.Model.Service;

import org.springframework.stereotype.Component;

@Component
public class Internet_Payment extends service {

	public Internet_Payment()
	{   setID(2);
		setAmount(15);
		Types.add("Vodafone");
		Types.add("Etisalat");
		Types.add("Orange");
		Types.add("We");
	}

}