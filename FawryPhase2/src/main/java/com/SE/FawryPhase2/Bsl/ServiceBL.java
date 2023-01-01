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
	public void ADD_SERVICE(int amount,int id,String type )
	{
		service obj=new service()
		{
			@Override
			public void set_Types(String type) {
				super.set_Types(type);

			}

			@Override
			public void setID(int id) {
				super.setID(id);
			}

			@Override
			public void setAmount(int amount) {
				super.setAmount(amount);
			}

		};
		obj.set_Types(type);
		obj.setID(id);
		obj.setAmount(amount);

		SERVICES.add(obj);

	}

	public int getServicesAmount(int id)
	{   int x = 0;
		for(int i=0;i<SERVICES.size();i++)
			if(SERVICES.get(i).getID()==id) {
				x=SERVICES.get(i).getAmount();
			}
		return x;

	}
	public ArrayList<String> getServicesTypes(int id)
	{   ArrayList<String> x =  new ArrayList<>();
		for(int i=0;i<SERVICES.size();i++)
			if(SERVICES.get(i).getID()==id) {
				x=SERVICES.get(i).get_Types();
			}
		return x;

	}


}