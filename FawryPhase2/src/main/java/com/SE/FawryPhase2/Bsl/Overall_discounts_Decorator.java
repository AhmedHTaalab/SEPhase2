package com.SE.FawryPhase2.Bsl;

import com.SE.FawryPhase2.Model.Discount.Discount;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Overall_discounts_Decorator extends Decorator {

	public Discount discount;
	
//	public Overall_discounts_Decorator(Discount discount) {
//		this.discount = discount;
//	}
	public List<Integer> overallDecorator = new ArrayList<>();
	public void Add_Discount(int discount) {
		overallDecorator.add(discount);
	}
	public ArrayList<Integer> getOverallDecorator (){
		return (ArrayList<Integer>) overallDecorator;
	}
	public String getDescription() {
		return discount.getDescription() + " ,Overall_discounts";
	}
	public double percentage() {
		return 10.00 + discount.percentage();
	}

}