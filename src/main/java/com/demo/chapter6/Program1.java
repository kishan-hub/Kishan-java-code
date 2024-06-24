package com.demo.chapter6;

//create an array of 5 floats and calulate thier sum

public class Program1 {
  
	public static void main(String[] args) {
		
		float[] nArray = new float[5];
		
	     nArray[0]=23.1f;
	     nArray[1]=34.1f;
	     nArray[2]=120.2f;
	     nArray[3]=23.1f;
	     nArray[4]=10.1f;
	     float sum =0;
	     for(float f:nArray) {
	    	 sum+=f;
	     }
	     System.out.println("Sum of Array is: "+sum);
	}
	
}
