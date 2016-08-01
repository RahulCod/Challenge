package com.ccApp.cc;

public abstract class CreditCard {
	/*Using an Abstract Method to satisfy Lsikov Substitution principle*/

	private Integer balance;
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public abstract double interest();
	public double calculateInterest(float time) {
		return (this.balance * time * interest());
	}
}
