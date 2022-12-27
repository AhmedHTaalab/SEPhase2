package models;

import java.lang.String;

import Fawry.CreditCard;
import Fawry.Payment;
import Fawry.Refund;
import Fawry.Search;
import Fawry.Services;
import Fawry.Wallet;

public class User {
	private int WalletAmount;
	public static int Fees;
    private String email;
    private String password;
    private String username;
    private Wallet wallets;
    private Services s;
 
public User(String em,String pass, String user, Wallet wall,int Fee){
        setEmail(em);
        setPassword(pass);
        setUsername(user);
        setWallets(wall);
        Fees = Fee;

}


public User() {}
public Wallet getWallets() {
	return wallets;
}
public void setWallets(Wallet wallets) {
	this.wallets = wallets;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

public int getWalletAmount() {
	return WalletAmount;
}
public void setWalletAmount(int walletAmount) {
	WalletAmount = walletAmount;
}



public void PayAmount(Payment py) {
	py.Pay(Fees);
}

public void InsertInWallet(CreditCard cc, int WalletAmount) {
	
	cc.insertInWallet(WalletAmount);
}
public void check_wallet_money() {
	
	wallets.check_wallet_money();
}
public void UserSearch(Search sc) {
	sc.show_services_type();
	
}
public void RequestRefund(Refund rf) {
	rf.requestRefund(Fees, username, s);
}


}
