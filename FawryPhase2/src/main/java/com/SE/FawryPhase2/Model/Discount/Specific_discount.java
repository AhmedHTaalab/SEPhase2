package com.SE.FawryPhase2.Model.Discount;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Specific_discount extends Discount{

//	public Specific_discount() {
//		Description = "Specific_discount\n";
//	}
	public List<Integer> specific = new ArrayList<>();

	public void Add_Discount(int discount) {
		specific.add(discount);
	}
	public ArrayList<Integer> getSpecific (){
		return (ArrayList<Integer>) specific;
	}
	public double percentage() {
		return 20.00;
	}

}