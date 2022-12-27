package Fawry;
public class CreditCard extends Payment {
	
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	
	public CreditCard(String cN, String cv, String date) {
		setCardNumber(cN);
		setCvv(cv);
		setDateOfExpiry(date);
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	@Override
	public String Pay(int amount) {
		
		return  " paid with Credit Card";
	}

		

	public void insertInWallet(int Wamount) {
		
		new Wallet(Wamount);
		
		System.out.println(Wallet.Wamount +" Inserted In Wallet");
		
	}



}
