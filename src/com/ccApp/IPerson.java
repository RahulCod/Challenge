package com.ccApp;

import java.util.List;

import com.Wallet.Wallet;
import com.ccApp.cc.CreditCard;

public interface IPerson {
	
	public double CalculateIntrest();

	public void setWallet(List<Wallet> wallets);

	public List<Wallet> getWallet();

}
