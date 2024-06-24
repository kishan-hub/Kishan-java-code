package com.demo.chapter1;

import java.util.Scanner;

class Program3 {
	
	public static double convertKilometersToMiles(double kilometers) {
 
	 final double conversionFactor =0.621371;
	 return kilometers * conversionFactor;
	}
	
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter The no in kilometer");
		double km =scanner.nextDouble();
		//converting Kilomters to miles
		double miles =convertKilometersToMiles(km);
		
		//Displaying the results
		System.out.println(km+ " Kilometers is equal to miles "+miles+" miles");
		
		//closeing the scanner object
		scanner.close();
	}

}
