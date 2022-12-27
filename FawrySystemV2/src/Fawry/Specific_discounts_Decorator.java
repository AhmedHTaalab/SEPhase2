package Fawry;

import java.util.Scanner;

public class Specific_discounts_Decorator extends Decorator {

	Discount discount;
	
	public Specific_discounts_Decorator(Discount discount) {
		this.discount = discount;
	}
	
	Scanner input = new Scanner(System.in);
	int x;
	public void Add_Discount() {
		System.out.println("Add Discount \n "
				+ "1) Overall Discount\n"
				+ "2) Specific Discount\n");
		x = input.nextInt();
		if(x == 1)
		{
			Discount discount1 = new Specific_discount();
			discount1 = new Overall_discounts_Decorator(discount1);
			System.out.println(discount1.getDescription()+ " %" + discount1.percentage());
		}
		else if(x == 2)
		{
			Discount discount1 = new Specific_discount();
			discount1 = new Specific_discounts_Decorator(discount1);
			System.out.println(discount1.getDescription()+ " %" + discount1.percentage());
		}
		else
			System.out.println("Error, You are Entered Wrong Choose\n");
	}
	public String getDescription() {
		return discount.getDescription() + " ,Specific_discounts";
	}
	public double percentage() {
		return 20.00 + discount.percentage();
	}
}
