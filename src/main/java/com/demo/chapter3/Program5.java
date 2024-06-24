package com.demo.chapter3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//write a program to check student is pass or fail
public class Program5 {
 
  public static void main(String[] args) {
    
	  Map<String,Double> subjectWithMark=new HashMap<>();
	  subjectWithMark.put("Math", 98.1);
	  subjectWithMark.put("physics",70.0);
	  subjectWithMark.put("chemestry", 67.9);
	  Student student= new Student(10, "shivam", subjectWithMark);
	  
	  Map<String, Double> subWithmarks =student.getSubjectWithMark();
	  
	  List<Double> values =new ArrayList<>(subWithmarks.values());
	  double sum=0.0,avg=0.0;
	  for(Double mark: values) {
		  
		  sum+=mark;
		  avg=sum/values.size();
	  }
	  System.out.println("Avg Subject marks percentage: "+avg);
	  
	   
}
}
