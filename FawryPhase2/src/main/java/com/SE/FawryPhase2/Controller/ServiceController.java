package com.SE.FawryPhase2.Controller;

import com.SE.FawryPhase2.Bsl.ServiceBL;
import com.SE.FawryPhase2.Model.Service.service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    public void addService(service s)
    {

        ServiceBL obj=new ServiceBL();
        obj.ADD_SERVICE(s);
    }

    service Search(service s)
    {
        ServiceBL obj=new ServiceBL();
        return obj.get_SERVICES(s);
    }

    int calculate_amount(service s,int x)
    {
        x=x+s.amount;
        return x;
    }
}
