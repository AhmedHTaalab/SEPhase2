package com.SE.FawryPhase2.Model.Discount;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public abstract class Discount {

		String Description = "Unknown Discount\n";

		public String getDescription()
		{
			return Description;
		}
		
		public abstract double percentage();

		public abstract void Add_Discount(int discount);
	}

