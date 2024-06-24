package com.demo.chapter6;

//write a program to find the minimum elemnet in array

public class Program6 {
	
 public static int findMinmElement(int[]array) {
	 
	 int min=array[array.length -1];
	 
	 for(int i=0;i<array.length -1;i++) {
		  if(min>array[i]) {
			  min=array[i];
		  }
	 }
	 System.out.println("Minimum element is : "+min);
	 return min;
  }
  public static void main(String[] args) {
		int [] array = {10,40,50,70,90,30,20,5};
	    findMinmElement(array);
  }
}
