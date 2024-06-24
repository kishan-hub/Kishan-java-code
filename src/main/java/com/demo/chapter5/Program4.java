package com.demo.chapter5;

import java.util.Scanner;

public class Program4 {

	public static int sumOfEven(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			int temp=i;
			while(temp%2==0) {
	           sum+=temp;
			}    
		}
		return sum;
	}
	public static void main(String[] args) {
		int s=sumOfEven(10);
		System.out.println("sum of no: "+s);
	}
}
