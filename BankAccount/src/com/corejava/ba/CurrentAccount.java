package com.corejava.ba;

public class CurrentAccount extends BankAccount{
	private double overdraftLimit;

	public CurrentAccount(String id, String name, double balance, double overdraftLimit) {
		super(id, name, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	public void withdraw(double amount) {
		if(amount > balance + overdraftLimit) {
			System.out.println("Exceeded overdraft limit");
		}
		else {
			balance  -= amount;
		}
	}
	
}

