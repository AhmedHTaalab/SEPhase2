package com.SE.FawryPhase2.Model.Service;

import org.springframework.stereotype.Component;

@Component
public class Mobile_recharge extends service {

	public Mobile_recharge()
	{   setID(1);
		setAmount(10);
		Types.add("Vodafone");
		Types.add("Etisalat");
		Types.add("Orange");
		Types.add("We");
	}


}
