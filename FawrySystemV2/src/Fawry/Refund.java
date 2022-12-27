package Fawry;

import java.util.ArrayList;
import java.util.List;


public class Refund {
	
	private int amount; 
	private String phoneNum;
	private Services service;
	
	public Refund(int amount, String phoneNum, Services service) {
		
		this.amount = amount;
		this.phoneNum = phoneNum;
		this.service = service;

	}
	
	String getNum() {
		return phoneNum;
	}
	
	Services getService() {
		return service;
	}
	
	int getAmount() {
		return amount;
	}
	
	private List<Refund> refund = new ArrayList<Refund>();
	
	List<Admin> admin = new ArrayList<Admin>();
	
	void addAdmin(String name, int Id, String email) {
		
		admin.add(new Admin(name, Id, email));
		
	}
	
	public void requestRefund(int amount, String UserName, Services service) {
		
		refund.add(new Refund(amount, UserName, service));
		notifyAdmins(new Refund(amount, UserName, service));
	}
	
	void refundConfirmation(String confirmation) {
	
		if(confirmation =="Yes") {
			System.out.print("Refunded");
		} else {
			System.out.print("Not Refunded");
		}
		
	}
	
	List<Refund> getRefunds(){
		return refund;
	} 
	
	void notifyAdmins(Refund refund) {
		for(Admin admin: admin) {
			admin.updateRefund(refund);
		}
		
	}
}