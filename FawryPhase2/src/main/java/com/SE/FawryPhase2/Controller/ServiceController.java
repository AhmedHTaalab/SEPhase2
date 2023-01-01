package com.SE.FawryPhase2.Controller;

import com.SE.FawryPhase2.Bsl.ServiceBL;
import com.SE.FawryPhase2.Model.Service.service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ServiceController {
    @PostMapping(value = "/Service/Add")
    public void addService(@RequestParam("amount") int amount, @RequestParam("id") int id, @RequestParam("type") String type)
    {

        ServiceBL obj=new ServiceBL();
        obj.ADD_SERVICE( amount, id, type);
    }
    @GetMapping(value = "/Service/SearchType")
    ArrayList<String> SearchServiceType(@RequestParam("id") int id)
    {
        ServiceBL obj=new ServiceBL();
        return obj.getServicesTypes(id);
    }
    @GetMapping(value = "/Service/SearchAmount")
    int SearchServiceAmount(@RequestParam("id") int id)
    {
        ServiceBL obj=new ServiceBL();
        return obj.getServicesAmount(id);
    }
    @GetMapping(value = "/Service/calculate_amount")
    int calculate_amount(@RequestParam("id") int id,@RequestParam("x") int x)
    {
        x=x+ SearchServiceAmount(id);
        return x;
    }
}