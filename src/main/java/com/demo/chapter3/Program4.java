package com.demo.chapter3;

import java.util.Scanner;

//write a program to detect double and triple spaces in a String

public class Program4 {
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		//promoting user to enter a string
		System.out.println("Enter a string: ");
		String input =scanner.nextLine();
		//checking for double and triple spaces
		boolean hasDoubleSpaces= input.contains(" ");
		boolean hasTripleSpace= input.contains("   ");
		
		if(hasDoubleSpaces && hasTripleSpace) {
			System.out.println(" The string contains both double and trip[le spaces");
		}
		else if(hasDoubleSpaces) {
			System.out.println("The String contains only double spaces");
		}else if(hasTripleSpace) {
			System.out.println("The String contains only has triple spaces");
		}else {
			System.out.println("The String contains neither double nor triple spaces in String");
		}
		
		//closed the scaanner object
		scanner.close();
		
	}

}
