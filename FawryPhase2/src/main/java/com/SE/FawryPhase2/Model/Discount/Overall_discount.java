package com.SE.FawryPhase2.Model.Discount;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Overall_discount extends Discount {

//	public Overall_discount() {
//		Description = "Overall_discounts\n";
//	}

	public List<Integer> overall = new ArrayList<>();

	public void Add_Discount(int discount) {
		overall.add(discount);
	}
	public ArrayList<Integer> getOverall (){
		return (ArrayList<Integer>) overall;
	}
	public double percentage() {
		return 10.00;
	}

}

