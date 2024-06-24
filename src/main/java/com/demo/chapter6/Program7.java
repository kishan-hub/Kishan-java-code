package com.demo.chapter6;

public class Program7 {

	public static void main(String[] args) {
		
		int[] sortedArray = {23,45,67,90,100,899};
		int [] unsortedArray= {67,899,23,90,100,45};
		
		//check if the arrays are sorted 
		System.out.println("Is the first array sorted?  "+isSorted(sortedArray));
		System.out.println("is the second array sorted?  "+isSorted(unsortedArray));
	}

	public static boolean isSorted(int[] sortedArray) {
		
		for(int i=0;i<sortedArray.length - 1;i++) {
			 if(sortedArray[i] > sortedArray[i+1]) {
				 return false;
			 }
		}
		return true;
	}
}
