package com.app.java8;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int no=sc.nextInt();
		 String temp = Integer.toString(no);
	        boolean result = IntStream.range(0,temp.length()/2).noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length()-i-1));
	       
	        if(result==true)
	        	System.out.println(no+ " is palindrome");
	        else
	        	System.out.println(no+ " is not palindrome");
	        
	  
	}
}
