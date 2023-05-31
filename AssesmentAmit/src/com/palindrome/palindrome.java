package com.palindrome;

public class palindrome {
  


	public static void main(String[] args) {
		
		
		String string = "SAS";

		System.out.println("Your entered number is " + string + " and it is ");
		String reversed = new StringBuilder(string).reverse().toString();
		if(string.equals(reversed))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
		}
		  
		  
	}

