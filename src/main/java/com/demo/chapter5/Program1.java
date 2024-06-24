package com.demo.chapter5;

public class Program1 {
	
	public int printNaturalNo(int no1,int no2) {
       
		if(no1==no2) {
			return no1;
		}
		if(no1<=no2) {
			
			printNaturalNo(no1, no2 - 1);
		}
		return no1;
	}
	
	public static void main(String[] args) {
		Program1 p1=new Program1();
		System.out.println(p1.printNaturalNo(100, 200));
	}

}
