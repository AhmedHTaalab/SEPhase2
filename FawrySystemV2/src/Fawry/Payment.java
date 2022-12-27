package Fawry;

import java.util.ArrayList;
import java.util.List;

public abstract class Payment {
	
	public final  List<Payment> paymenttable;
	
	public Payment() {
		this.paymenttable= new ArrayList<>();
	}
	
	public abstract String Pay(int amount);
		

}
