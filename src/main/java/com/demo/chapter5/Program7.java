package com.demo.chapter5;

import java.util.Scanner;

//write a program to print multipliation table of 10 in reverse order
public class Program7 {
	
	public static void main(String[] args) {
		
		Scanner scaner =new Scanner(System.in);
		System.out.print("Enter The table no: ");
		int n=scaner.nextInt();
		
		for(int i=10;i>0;i--) {
			System.out.printf("%d * %d = %d\n",n,i,n*i);
		}
		
	}

}
