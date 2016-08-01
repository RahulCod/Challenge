package com.Wallet;

import java.util.List;

import com.ccApp.cc.CreditCard;

public class Wallet {

	List<CreditCard> cards;

	public List<CreditCard> getCards() {
		return cards;
	}

	public void setCards(List<CreditCard> cards) {
		this.cards = cards;
	}

	public double getInterestForWallet() {
		double total = 0.0;
		for (CreditCard card : cards) {
			total +=card.calculateInterest(1);
		}
		return total;
	}
}
