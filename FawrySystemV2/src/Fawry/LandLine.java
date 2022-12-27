package Fawry;
public class LandLine extends Services {

	public void show_services_type()
	{ 
		System.out.println(" 1.Monthly receipt \n 2.Quarter receipt \n");
	
	};
	public String choose_services_type(int x)
	{

		String t="";
		if(x==1)
			t="Monthly receipt";
		else
			t="Quarter receipt";
		return t;
	};
}