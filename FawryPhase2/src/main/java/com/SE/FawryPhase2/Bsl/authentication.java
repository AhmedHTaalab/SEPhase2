package com.SE.FawryPhase2.Bsl;

import java.util.ArrayList;
public class authentication
{
    public static int count = 0;
    public int userID=1;

    ArrayList<String> userName = new ArrayList<String>() ;
    ArrayList<String> Pssword = new ArrayList<String>() ;

    public String Sign_up(String U,String P) {
        String str = "", ans;
        for (int i = 0; i < userID; i++) {
            if (userName.get(i) == U)
               return "user name is existent";
            else {
                userName.add(U);
                Pssword.add(P);
                count++;
                userID++;
                return "successful Sign UP";
            }

        }
        return" ";
    }
        public String LogIn(String U, String P)
        {
            String s = "";
            for (int i = 0; i < userID; i++)
                if (!(userName.get(i) == U & Pssword.get(i) == P))
                    s = "your user name or password is wrong \n";
            return s;


        }

    }
