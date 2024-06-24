package com.demo.chapter5;

public class Program2 {
  
	public static void printReverseNumbers(int no){
	
		for(int i=0;i<=no;i++) {
			System.out.println(no-i);
		}
	}
	public static void main(String[] args) {
		printReverseNumbers(100);
	}
}
