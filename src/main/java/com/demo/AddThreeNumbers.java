package com.demo;

public class AddThreeNumbers {

	public int addNumber(int a,int b, int c) {
		int sum=0;
		sum=a+b+c;
		return sum;
	}
	public static void main(String[] args) {
		AddThreeNumbers add=new AddThreeNumbers();
		System.out.println(add.addNumber(10, 20, 30));
	}
}
