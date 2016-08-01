package com.ccApp.cc;

public class Discover extends CreditCard {

	@Override
	public double interest() {
		return 0.01;
	}
	
	public CreditCard getCreditCard(int balance) {
		CreditCard card = new Discover();
			card.setBalance(balance);
			return card;
		}

}
