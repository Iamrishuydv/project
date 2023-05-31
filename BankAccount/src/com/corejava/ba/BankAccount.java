package com.corejava.ba;

public class BankAccount {
	private String id;
	private String name;
	public double balance;
	
	
	public BankAccount(String id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance In Your Bank Account");
		}
		else {
			balance -= amount;
		}
	}

}


