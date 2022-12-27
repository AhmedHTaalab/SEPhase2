package Fawry;
public class Internet_Payment extends Services {

	public void show_services_type()
	{ 
		System.out.println(" 1.Vodafone \n 2.Etisalat \n 3.Orange \n 4.We \n");
		
	};
	public String choose_services_type(int x)
	{
		String t="";
		if(x==1)
			t="Vodafone";
		else if(x==2)
			t="Etisalat";
		else if(x==3)
			t="Orange";
		else
			t="We";
		return t;
	};

}
