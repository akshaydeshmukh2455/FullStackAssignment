package com.stringAssignment;

public class Program6 {

	public static void main(String[] args) {
		String str=new String("Akshay");
		String ans =str.intern();
		System.out.println("Heap memory:"+str);
		System.out.println("String Constunt pool:"+ans);
	}
}
