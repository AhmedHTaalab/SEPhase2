package Fawry;
public class Search extends Services {
	Services s;
	public void show_services_type()
	{
		System.out.println(" 1.Mobile recharge services. \n 2.Internet Payment services. \n 3.Landline services \n 4.Donations \n");
	};
	void create_object(int x)
	{ 
		if(x==1)
			 s=new Mobile_recharge();
		else if(x==2)
			s=new Internet_Payment();
		else if(x==3)
			s=new LandLine();
		else
			s=new Donations();
		s.show_services_type();
	};
	 String choose_services_type(int x)
	 {
		return s.choose_services_type(x);	
	 };

}