package com.demo.chapter1;

import java.util.Scanner;

//Write a java Program to detect whether no
//Entered by user is integer or Not

public class Program4 {

	public static void main(String[] args) {
		
		Scanner scaner =new Scanner(System.in);
		
		//promoting user to enter a value
		System.out.println("Enter a number: ");
		String input =scaner.nextLine();
		
		//checking if the entered value is an Integer
		if(isInteger(input)) {
			System.out.println("The entered value is an Integer");
		}
		else {
			System.out.println("The entered value is not an Integer");
		}
		
		//closeing the scanner object
		scaner.close();
	}	
	
   public static boolean isInteger(String value) {
	   
	   try
	   {
		   Integer.parseInt(value);
		   return true;
	   }
	   catch (Exception e) {
		return false;
	   }
	   
   }
	
}
