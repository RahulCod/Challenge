package com.ccApp.cc;


public class Visa extends CreditCard {

	@Override
	public double interest() {
		return 0.1;
	}
	public CreditCard getCreditCard(int balance) {
		CreditCard card = new Visa();

			card.setBalance(balance);
			return card;
		}

}
