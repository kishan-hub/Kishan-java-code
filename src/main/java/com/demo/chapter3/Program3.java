package com.demo.chapter3;

public class Program3 { 
	
	 public String letterTemplate(String letter) {
		String name="Kishan";
		//Replace the word
		String  replaced =letter.replaceAll("<|Name|>", name);
		return replaced;
	 }
    

}
