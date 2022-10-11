package com.stringAssignment;

public class Program3 {
	public static void main(String[] args) {
		String str1,str2;
		
		str1="akshay";
		str2=str1.replaceAll("[aeiouAEIOU]", "");
		System.out.println(str2);
	}
}
