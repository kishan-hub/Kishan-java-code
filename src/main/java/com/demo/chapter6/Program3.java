package com.demo.chapter6;

/*
 * calculate the average marks from an array containing marks of
 * all students in physics using loops
 */

public class Program3 {

	public static float calulateAvgMarks(float[] marks){
		
		float avgmark=0.0f,sum=0.0f;
	
		for(float mark:marks) {
			sum+=mark;
			avgmark=sum/marks.length;
		}
		return avgmark;
	}
	
	public static void main(String[] args) {
		
		float [] marks = {98.0f,78.4f,90.1f,92.1f,89.1f,45.5f,67.2f};
		
		System.out.println("Avg marks of physics: "+calulateAvgMarks(marks));
		
	}
}
 