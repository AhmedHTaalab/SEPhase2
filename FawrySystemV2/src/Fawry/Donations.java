package Fawry;
public class Donations extends Services{
	
	public void show_services_type()
	{
		System.out.println(" 1.Cancer Hospital \n 2.Schools \n 3.NGOs \n");
	};
	public String choose_services_type(int x)
	{
		String t="";
		if(x==1)
			t="Cancer Hospital";
		else if(x==2)
			t="Schools";
		else
			t="NGOs";
		return t;
	};

}