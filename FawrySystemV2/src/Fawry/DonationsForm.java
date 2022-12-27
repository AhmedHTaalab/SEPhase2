package Fawry;

public class DonationsForm implements Form{
	private String charity;
	private int amount;
	
	public DonationsForm(String charit, int am) {
		setCharity(charit);
		setAmount(am);
		
	}

	public String getCharity() {
		return charity;
	}

	public void setCharity(String charity) {
		this.charity = charity;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public int CheckOut(String charity, int amount) {
		
		System.out.println(amount+"Has been paid as a Donation for Charity:"+charity);
		int fees = amount + 20;
		return fees;
		
	}
	
}
