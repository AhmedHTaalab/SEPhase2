package Fawry;
public abstract class Services {
	public Services()
	{
		System.out.println("Enter the number of service's type \n");
	};
	abstract void show_services_type();
	abstract String choose_services_type(int x);
}