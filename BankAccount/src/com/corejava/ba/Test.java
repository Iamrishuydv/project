package com.corejava.ba;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Id: ");
//		String id = sc.next();
		
		BankAccount account1 = new BankAccount("12102011", "Rishu Raj", 0);
		System.out.println("Id :" + account1.getId());
		System.out.println("Name :" + account1.getName());
		account1.deposit(14000);
		System.out.println("The Account Balance is : " + account1.getBalance());
		account1.deposit(5000);
		System.out.println("On second deposit balance is : " + account1.getBalance());
		System.out.println("After Trying over withdrawl:");
		account1.withdraw(50000);
		System.out.println("Withdraw of 500");
		account1.withdraw(500);
		System.out.println("Now The Account Balance is : " + account1.getBalance());
		
		System.out.println("------------------------------------------");
	
		CurrentAccount account2 = new CurrentAccount("343","Rishu Raj", 50000, 2000);
		System.out.println("You're in now Current Account");
		System.out.println("Id :" + account2.getId());
		System.out.println("Name :" + account2.getName());
	
		System.out.println("The Account Balance is : " + account2.getBalance());
		System.out.println("The Account Balance is : " + account2.getOverdraftLimit());
		account2.withdraw(50100);
		System.out.println("The Account Balance is : " + account2.getBalance());
		System.out.println("The Account Balance is : " + account2.getOverdraftLimit());
		
//		account2.deposit(1000);
//		System.out.println("The Account Balance is : " + account2.getBalance());
//		account2.deposit(500);
//		System.out.println("The Account Balance is : " + account2.getBalance());
//		account2.deposit(3000);
//		System.out.println("The Account Balance is now : " + account2.getBalance());
//		account2.withdraw(6000);
	}

}
