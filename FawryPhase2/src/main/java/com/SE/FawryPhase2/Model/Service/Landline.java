package com.SE.FawryPhase2.Model.Service;


import org.springframework.stereotype.Component;

@Component
public class Landline extends service {

	public Landline()
	{
		amount=15;
		Types.add("Monthly receipt");
		Types.add("Quarter receipt");
		
	}

}
