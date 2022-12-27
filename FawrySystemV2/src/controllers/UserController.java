package controllers;

import Fawry.Payment;
import Fawry.User;
import businesslogic.UserBsl;
import Fawry.CreditCard;
import Fawry.Wallet;

public class UserController {
	
	private UserBsl userbsl;
	
	public UserController(UserBsl userbsl) {
	
		this.userbsl = userbsl;
		
	}

	public UserBsl getUserbsl() {
		return userbsl;
	}

	public void setUserbsl(UserBsl userbsl) {
		this.userbsl = userbsl;
	}
	
	public void PayAmount(Payment py) {
		userbsl.PayAmount(py);
	}
	
	public void InsertInWallet(CreditCard cc, int WalletAmount) {
		
		cc.insertInWallet(WalletAmount);
	}
	public void check_wallet_money(Wallet wallets) {
		
		wallets.check_wallet_money();
	}
	

}
