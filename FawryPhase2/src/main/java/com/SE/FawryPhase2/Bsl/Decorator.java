package com.SE.FawryPhase2.Bsl;

import com.SE.FawryPhase2.Model.Discount.Discount;
import org.springframework.stereotype.Component;

@Component
public abstract class Decorator extends Discount {

	public abstract String getDescription();
}
