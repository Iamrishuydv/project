package com.assessment;
import java.io.*;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Samruddhi" ,nstr = " ";
		char ch = 0;
		
		System.out.print("Original: ");
		System.out.println(str);
		
		for(int i =0; i < str.length(); i++) {
			ch = str.charAt(i);
			
			nstr = ch + nstr;
		
			}
		
			System.out.println("Reversed order : " + nstr);
			
		
}
}

//public class FibonacciSeries {
//    public static void main(String[] args) {
//        int count = 10; // Number of terms to generate
//        System.out.println("Fibonacci Series up to " + count + " terms:");
//        for (int i = 0; i < count; i++) {
//            System.out.print(fibonacci(i) + " ");
//        }
//    }
//    
//    public static int fibonacci(int n) {
//        if (n <= 1) {
//            return n;
//        } else {
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }
//    }
//}
