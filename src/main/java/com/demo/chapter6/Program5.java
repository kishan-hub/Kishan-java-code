package com.demo.chapter6;

//write a program to find maximum element in array

public class Program5 {
	
	public static void main(String[] args) {
		int [] array = {10,40,50,70,90,30,20,5};
	    findMaximumElement(array);
	}
	
	public static int findMaximumElement(int[] array) {
	    
		int max=array[0];
		
		for(int i=1;i<array.length-1;i++) {
		   if(max<array[i]) {
			   max=array[i];
		   }
		}
		System.out.println("Maximum value is "+max);
		return max;
	}

}
