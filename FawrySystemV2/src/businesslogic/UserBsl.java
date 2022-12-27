package businesslogic;

import java.util.ArrayList;
import java.util.List;

import Fawry.Payment;
import Fawry.User;



public class UserBsl {
	
	
	private int Fees;
	private final List<User> usertable;
	public UserBsl() {
		this.usertable = new ArrayList<>();
	}
	public List<User> getUsertable() {
		return usertable;
	}
	
	public void PayAmount(Payment py) {
		py.Pay(Fees);
	}
	

	

}
