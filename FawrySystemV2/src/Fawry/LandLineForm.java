package Fawry;
public class LandLineForm implements Form {
	private String homeNumber;
	private int amount;
	
	public LandLineForm(String Hnum, int am) {
		setHomeNumber(Hnum);
		setAmount(am);
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public int CheckOut(String Hnum, int amount) {
		
		System.out.println(amount+"Has been paid for LandLine Service for Home Number:"+Hnum);
		int fees = amount + 20;
		return fees;
		
	}

}