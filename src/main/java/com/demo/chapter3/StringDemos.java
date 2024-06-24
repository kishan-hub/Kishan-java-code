package com.demo.chapter3;

public class StringDemos {

	public static void main(String[] args) {
		
	//	System.out.printf("%c", 'A');
		String name ="welcome to new brushup java program";
		int l=name.length();
		String toLowerCase=name.toLowerCase();
		String toUpperCase=name.toUpperCase();
		String trim=name.trim();
	    String subs =name.substring(8);
	    System.out.println(subs);
	    String newsubs=name.substring(11,28);
	    System.out.println(newsubs);
	    
	    String str ="Harry";
	    String newWord =str.replace('r','p');
	    System.out.println(newWord);
	    
	    boolean s =newWord.startsWith("Ha");
	    System.out.println(s);
	    
	    boolean endswith=newWord.endsWith("py");
	    System.out.println(endswith);
	    
	    char charAt =str.charAt(str.length()-1);
	    
	    System.out.println(charAt);
		
	}
}
