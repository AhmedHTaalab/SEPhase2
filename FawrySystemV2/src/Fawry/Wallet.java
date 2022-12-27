package Fawry;

public class Wallet extends Payment {
	public static int Wamount;
	

	public Wallet(int am) {
		Wamount = am;
	
	}
	

	public Wallet() {
		
	}

	@Override
	public String Pay(int amount) {
		
		if(Wamount >= amount) {
		Wamount = Wamount - amount;
		return " Paid with Wallet";
		
		}
		else {
			return "No enough money in the wallet";
		}
		
	}

	public int check_wallet_money() {
		
		return  Wamount;
	}
	


}


