package com.SE.FawryPhase2.Bsl;
import com.SE.FawryPhase2.Model.Service.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ServiceBL {
	ArrayList<service> SERVICES = new ArrayList<service>() ;
	public ServiceBL()
	{   service Landline = new Landline();
		SERVICES.add(Landline);
		service Mobile_recharge = new Mobile_recharge();
		SERVICES.add(Mobile_recharge);
		service Donation = new Donation();
		SERVICES.add(Donation);
		service Internet_Payment = new Internet_Payment();
		SERVICES.add(Internet_Payment);
	}
	public void ADD_SERVICE(service S)
	{
		SERVICES.add(S);
	}
	public service get_SERVICES(service S)
	{   int x = 0;
		for(int i=0;i<SERVICES.size();i++)
			if(SERVICES.get(i)==S)
				x=i;
		return SERVICES.get(x);

	}

}