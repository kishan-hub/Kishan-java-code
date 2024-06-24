package com.demo.chapter3;

import java.util.List;
import java.util.Map;

public final class Student {
	
	private final int rollno;
	
	private final String name;
	
	private final Map<String,Double> subjectWithMark;

	public Student(int rollno, String name, Map<String, Double> subjectWithMark) {
		this.rollno = rollno;
		this.name = name;
		this.subjectWithMark = Map.copyOf(subjectWithMark);
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public Map<String, Double> getSubjectWithMark() {
		return subjectWithMark;
	}
	
}
