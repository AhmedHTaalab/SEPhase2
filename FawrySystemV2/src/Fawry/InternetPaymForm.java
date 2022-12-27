package Fawry;
public class InternetPaymForm implements Form{
	private int amount;
	private String homeNumber;
	public InternetPaymForm(String Hnum, int am) {
		setHomeNumber(Hnum);
		setAmount(am);



	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getHomeNumber() {
		return homeNumber;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	@Override
	public int CheckOut(String Hnum, int amount) {
		
		System.out.println(amount+"Has been paid for InternetService for Home Number:"+Hnum);
		int fees = amount + 20;
		return fees;
		
	}
	
}