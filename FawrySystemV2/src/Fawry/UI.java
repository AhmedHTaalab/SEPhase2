package Fawry;

import java.util.Scanner;

public class UI {
	public static void main(String[] args) {
	
		Scanner cin = new Scanner(System.in);
		System.out.println("Welcome To Fawry \n");
		System.out.println("1)user..\n"
				+ "2)Admin..\n");
		int x = cin.nextInt();
		if(x == 1)
		{
			System.out.println("Enter Email");
			String Email = cin.next();
			System.out.println("Enter Password");
			String Password = cin.next();
			System.out.println("Enter UserName");
			String UserName = cin.next();
			System.out.println("Enter Amount in Wallet\n");
			int Wm = cin.nextInt(); 
			
			System.out.println("1)Search and Payment\n "
		    		+ "2)Refund\n ");
			int y = cin.nextInt();
			if(y == 1)
			{
				Wallet wx = new Wallet();
			User username = new User(Email,Password,UserName,wx,Wm);
			Search sc=new Search();
			username.UserSearch(sc);
		    int a=0;
		    a=cin.nextInt();
		    sc.create_object(a);
		    a=cin.nextInt();
		    System.out.println(sc.choose_services_type(a));

		    System.out.println("Choose the Payment Method\n"
		    		+ "1)Credit Card\n "
		    		+ "2)Wallett\n "
		    		+ "3)Cash\n");
		    int q = cin.nextInt();
		    System.out.println("Enter Amount should be Paid");
			int amount = cin.nextInt() ;
		    if(q == 1)
		    {
		    	System.out.println("Please Enter The Number/Charity");
		    	String number = cin.next() ;
		    	System.out.println("EnterCardNumber");
				String CardNumber = cin.next();
				System.out.println("Enter CVV");
				String CVV = cin.next();
				System.out.println("Enter Expiray Date");
				String Date = cin.next();
				
				
		    	CreditCard cc = new CreditCard(CardNumber, CVV, Date);
		    	username.PayAmount(cc);
		    	System.out.println(amount+" Added to :"+number);

		    }
		    else if(q ==2)
		    {
		    	System.out.println("Please Enter The Number/Charity");
		    	String xnumber = cin.next() ;
		    	Wallet wallet = new Wallet(amount);
		    	if(Wm>=amount)
		    	{
		    		username.PayAmount(wallet);
		    		System.out.println(amount+" Added to :"+xnumber);
		    		username.check_wallet_money();
		    	}
		    	else 
		    	{
					
		    		System.out.println("not enough\n");
					System.out.println("Enter CreditCard to add Amount in Wallet");
					System.out.println("EnterCardNumber");
					String CardNumber = cin.next();
					System.out.println("Enter CVV");
					String CVV = cin.next();
					System.out.println("Enter Expiray Date");
					String Date = cin.next();
					

					CreditCard cc = new CreditCard(CardNumber, CVV, Date);
					System.out.println("Enter Amount you want to insert in Wallet\n");
					int Wamount = cin.nextInt();
					username.InsertInWallet(cc,Wamount);
					
					
					
		    	}
		    	
		    }
		    else if(q == 3)
		    {
		    	System.out.println("Please Enter The Number/Charity");
		    	String znumber = cin.next() ;
		    	CashOnDelivery cash = new CashOnDelivery();
		    	username.PayAmount(cash);
		    	System.out.println(amount+" Added to :"+znumber);
		    }
		}
			else if(y == 2)
			{
				
				Services ser = new LandLine();
				System.out.println("Enter 1) MobileRecharge\n"
		                + "2) InternetPayment\n"
						+ "3) LandLine\n"
		                + "4) Donations\n");
				int l = cin.nextInt();
				if(l==1) {
					System.out.println("Enter phone number\n");
					String phonenumber = cin.next();
					System.out.println("Enter Amount should be Refunded");
					int amount = cin.nextInt() ;
					System.out.println("Your Request has been sent to the Admin to check it");
					Refund refund = new Refund(amount, phonenumber, ser);
					refund.requestRefund(amount, phonenumber, ser);
				}
				else if(l==2) {
					System.out.println("Enter home number\n");
					String homenumber = cin.next();
					System.out.println("Enter Amount should be Refunded");
					int amount = cin.nextInt() ;
					System.out.println("Your Request has been sent to the Admin to check it");
					Refund refund = new Refund(amount, homenumber, ser);
					refund.requestRefund(amount, homenumber, ser);
					
				}else if(l==3) {
					System.out.println("Enter home number\n");
					String homenumber = cin.next();
					System.out.println("Enter Amount should be Refunded");
					int amount = cin.nextInt() ;
					System.out.println("Your Request has been sent to the Admin to check it");
					Refund refund = new Refund(amount, homenumber, ser);
					refund.requestRefund(amount, homenumber, ser);
				}
				else if(l==4) {
					System.out.println("Enter Charity Name\n");
					String charit = cin.next();
					System.out.println("Enter Amount should be Refunded");
					int amount = cin.nextInt() ;
					System.out.println("Your Request has been sent to the Admin to check it");
					Refund refund = new Refund(amount, charit, ser);
					refund.requestRefund(amount, charit, ser);
				}
			
			}
		
		else
			System.out.println("Invalid selection \n");
		}
		else if(x == 2)
		{
			System.out.println("Enter Name \n");
			String name = cin.next();
			System.out.println("Enter ID \n");
			int id = cin.nextInt();
			System.out.println("Enter Email \n");
			String email = cin.next();
		
			Admin admin = new Admin(name, id, email);
			
			System.out.println("1)Add Discount\n"
					+"2)Add Service Provider\n");
			int i = cin.nextInt();
			if(i == 1)
			{
				System.out.println("Enter 1) Overall Discount\n"
		                + "2) Specific Discount\n");
				int l = cin.nextInt();
				if(l == 1)
				{
					Discount discount = new Overall_discount();
					discount.Add_Discount();
				}
				else if(l == 2)
				{
					Discount discount = new Specific_discount();
					discount.Add_Discount();
			}
		
			}

			else if(i == 2)
			{
				
				
				System.out.println("Add Service Provider\n");
				
				System.out.println("Enter 1) MobileRecharge\n"
		                + "2) InternetPayment\n"
						+ "3) LandLine\n"
		                + "4) Donations\n");
				int l = cin.nextInt();
				if(l==1) {
					
					System.out.println("Enter Number\n");
					String number = cin.next();
					System.out.println("Enter Money Amount\n");
					int amount = cin.nextInt();
					HandlerFactory MF = new MobileRechargeFactory(number,amount);
					admin.createHandler(MF);
					
				}
				else if(l ==2) {
					
					System.out.println("Enter Home Number\n");
					String number = cin.next();
					System.out.println("Enter Money Amount\n");
					int amount = cin.nextInt();
					HandlerFactory IF = new InternetPaymFactory(number,amount);
					admin.createHandler(IF);
				}
				else if( l== 3) {
					
					System.out.println("Enter Home Number\n");
					String number = cin.next();
					System.out.println("Enter Money Amount\n");
					int amount = cin.nextInt();
					HandlerFactory LF = new LandLineFactory(number,amount);
					admin.createHandler(LF);
				}
				else if (l==4) {
					
					System.out.println("Enter Charity name\n");
					String Charity = cin.next();
					System.out.println("Enter Money Amount\n");
					int amount = cin.nextInt();
					HandlerFactory DF = new DonationsFactory(Charity,amount);
					admin.createHandler(DF);
				}
			
				
			}
			else
				System.out.println("Invalid selection \n");
		}
		else
			System.out.println("Invalid selection \n");

	}
}

	



	


