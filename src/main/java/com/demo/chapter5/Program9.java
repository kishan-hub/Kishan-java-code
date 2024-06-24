package com.demo.chapter5;

import java.util.Scanner;

//write a program to calculate The sum of no occuring in the multiplication table of 8

public class Program9 {
	
  public static void main(String[] args) {
	
	  try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Enter The Table : ");
		  
		  int n =scanner.nextInt();
		  int sum=0;
		  for(int i=1;i<10;i++) {
			 sum=sum+(n*i);
			 System.out.printf("%d * %d = %d\n",n,i,n*i);
		  }
		     System.out.println("-------------");
		     System.out.println("Total   "+sum);
		     System.out.println("-------------");
	}
	  
	  
}

}
