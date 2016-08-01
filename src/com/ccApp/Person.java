package com.ccApp;

import java.util.List;

import com.Wallet.Wallet;

public class Person implements IPerson {

	private List<Wallet> wallet;

	public List<Wallet> getWallet() {
		return wallet;
	}

	public void setWallet(List<Wallet> wallet) {
		this.wallet = wallet;
	}
	
	public double CalculateIntrest(){
		double actual = 0;
		for (Wallet wall : getWallet()) {
			actual += wall.getInterestForWallet();
		}
		return actual;
	}
}
