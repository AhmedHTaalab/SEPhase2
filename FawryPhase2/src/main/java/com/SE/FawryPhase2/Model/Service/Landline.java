package com.SE.FawryPhase2.Model.Service;


import org.springframework.stereotype.Component;
@Component

public class Landline extends service {

	public Landline()
	{   setID(3);
		setAmount(15);
		Types.add("Monthly receipt");
		Types.add("Quarter receipt");

	}

}
