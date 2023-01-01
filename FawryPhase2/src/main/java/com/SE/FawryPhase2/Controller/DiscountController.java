package com.SE.FawryPhase2.Controller;

import com.SE.FawryPhase2.Model.Discount.Overall_discount;
import com.SE.FawryPhase2.Model.Discount.Specific_discount;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DiscountController {

    private Overall_discount overallDiscount;
    private Specific_discount specificDiscount;

    public DiscountController(Overall_discount overallDiscount, Specific_discount specificDiscount) {
        this.overallDiscount = overallDiscount;
        this.specificDiscount = specificDiscount;
    }

    public void Add_overall(@RequestBody int discount)
    {
        Overall_discount overallDiscount1 = new Overall_discount();
        overallDiscount1.Add_Discount(discount);
    }

    public void Add_specific(@RequestBody int discount)
    {
        Specific_discount specificDiscount1 = new Specific_discount();
        specificDiscount1.Add_Discount(discount);
    }

    @GetMapping (value = "/Discount/Overall/{discount}")
    public ArrayList<Integer> getOverall (@PathVariable("discount") int discount){
       Overall_discount overall = new Overall_discount();
        return overall.getOverall();
    }
    @GetMapping(value = "/Discount/Specific/{discount}")
    public ArrayList<Integer> getSpecific (@PathVariable("discount") int discount){
       Specific_discount specific = new Specific_discount();
        return specific.getSpecific();
    }
}
