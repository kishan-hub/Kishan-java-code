package com.demo.chapter5;

import java.util.Scanner;

public class Program6 {
	
	//multiplication of table n
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Table no");
		int n=scanner.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.printf("%d*%d=%d\n",n,i,n*i);
		}
	}

}
