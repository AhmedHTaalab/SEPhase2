package Fawry;

public class MobileRechForm implements Form {
	private int amount;
	private String mobileNumber;

	public MobileRechForm(String num, int am) {
		setAmount(am);
		setMobileNumber(num);
	}
	
	
	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	@Override
	public int CheckOut(String num, int amount) {
		System.out.println(amount+"Has been paid to Recharge Number"+num);
		int fees = amount + 20;
		return fees;
		
	}

}
