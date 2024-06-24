package com.demo.chapter5;

import java.util.Scanner;

//find factorial of a given number using for loops

public class Program8 {
  
	public static long factorial(long n) {
		if(n == 0) {
			return 1;
		}
		return	n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		
		try (var scanner = new Scanner(System.in)) {
			System.out.println("Enter the n :");
			long n=scanner.nextInt();
			 System.out.println(factorial(n));
		}
		
	}
}
