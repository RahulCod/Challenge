package com.ccApp.cc;

public class MC extends CreditCard {

	@Override
	public double interest() {
		return 0.05;
	}
	public CreditCard getCreditCard(int balance) {
		CreditCard card = new MC();
	
			card.setBalance(balance);
			return card;
		}

}
