package com.demo.chapter6;

import java.util.Scanner;

//write a program to find out whether
//a given integer is Present in an array or Not

public class Program2 {

   public static void main(String[] args) {
	
	   int[] array =new int[10];
	   int[] array1=array;
	   System.out.println(array.hashCode());
	   System.out.println(array1.hashCode());
	   
	   array[0]=10; array[6]=70;
	   array[1]=20; array[7]=80;
	   array[2]=30; array[8]=90;
	   array[3]=40; array[9]=100;
	   array[4]=50; array[5]=60;
	   
	   for(int value: array) {
		   System.out.print(value+"  ");
	   }
	   System.out.println();
	    System.out.print("Value is Present ? Answer : "+findIntegerInArray(23, array1));
  }
   public static boolean findIntegerInArray(int n,int[] array) {
	      boolean flag= false;
	   for(int value: array) {
		   if(value == n) {
			   flag = true;
		   }
	   }
	   return flag;
   }
}
