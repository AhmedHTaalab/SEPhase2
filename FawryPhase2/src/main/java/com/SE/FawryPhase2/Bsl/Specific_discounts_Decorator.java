package com.SE.FawryPhase2.Bsl;

import com.SE.FawryPhase2.Model.Discount.Discount;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Specific_discounts_Decorator extends Decorator {

	public Discount discount;
	
//	public Specific_discounts_Decorator(Discount discount) {
//		this.discount = discount;
//	}

	public List<Integer> specificDecorator = new ArrayList<>();

	public void Add_Discount(int discount) {
		specificDecorator.add(discount);
	}
	public ArrayList<Integer> getSpecificDecorator (){
		return (ArrayList<Integer>) specificDecorator;
	}
	public String getDescription() {
		return discount.getDescription() + " ,Specific_discounts";
	}
	public double percentage() {
		return 20.00 + discount.percentage();
	}
}
