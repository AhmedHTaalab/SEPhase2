package com.SE.FawryPhase2.Controller;

import com.SE.FawryPhase2.Bsl.authentication;

import java.util.Scanner;

public class AuthController{

    String user_name , password ,Status;
    private Scanner sc;
    authentication auth=new authentication();
    public String Check_Status(int S)
    {   sc = new Scanner(System.in);
        String str,ans;

        if(S == 1)
        {String U,P;
            System.out.printf("Enter User Name");
            U=sc.nextLine();
            System.out.printf("Enter Password");
            P=sc.nextLine();
            str= auth.Sign_up(U, P);
        }
        else
        {String U,P;
            System.out.printf("Enter User Name");
            U=sc.nextLine();
            System.out.printf("Enter Password");
            P=sc.nextLine();
            str= auth.LogIn(U, P);
        }
        ans=str;
        return ans;

    }

}