package com.demo.chapter6;

import java.util.Arrays;

//write a Program to reverse an  array

public class Program4 {
	
   public static void main(String[] args) {
	 
	   int [] intArr= {10,20,30,40,50,60,70,80};
	   
	   System.out.println(Arrays.toString(intArr));
	    int start=0;
	    int end = intArr.length - 1;
			   while(start<end) {
				   int temp=intArr[start];
				   intArr[start] = intArr[end];
				   intArr[end]=temp;
				   start++;
				   end--;
			   }
	     System.out.println(Arrays.toString(intArr));
	 }
}
