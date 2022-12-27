package Fawry;
public class DonationsFactory extends HandlerFactory {
	private Form createdForm;
	private String charity;
	private int amount;
	
	public DonationsFactory(String charit, int am) {
		this.setCharity(charit);
		this.setAmount(am);
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
	public  Form  create_Form(){

	     createdForm = new DonationsForm(charity,amount);
	    return createdForm;
	    
	    }

}