package com.SE.FawryPhase2.Model.Service;

import org.springframework.stereotype.Component;

@Component
public class Donation extends service
{
	public Donation()
	{  amount=5;
		Types.add("Cancer Hospital");
		Types.add("Schools");
		Types.add("NGOs");
	}

}

