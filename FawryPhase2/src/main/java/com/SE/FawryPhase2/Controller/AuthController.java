package com.SE.FawryPhase2.Controller;

import com.SE.FawryPhase2.Bsl.authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
@RestController
public class AuthController{

    String user_name , password ,Status;
    private Scanner sc;
    authentication auth=new authentication();
    @GetMapping("/auth/{S}/check")
    public String Check_Status(@PathVariable("S") int S)
    {   sc = new Scanner(System.in);
        String str,ans;

        if(S == 1)
        {String U,P;
            U=sc.nextLine();
            P=sc.nextLine();
            str= auth.Sign_up(U, P);
        }
        else
        {String U,P;
            U=sc.nextLine();
            P=sc.nextLine();
            str= auth.LogIn(U, P);
        }
        ans=str;
        return ans;

    }

}