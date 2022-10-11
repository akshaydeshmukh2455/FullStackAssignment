package com.stringAssignment;

public class Program2 {
	public static void main(String[] args) 
	{
		// Approach 1 Ascending order
		String str= "akshay";
		char charArray[]=str.toCharArray();
		char temp;
		
		for(int i=0; i<charArray.length;i++)
		{
			for(int j=i+1;j<charArray.length;j++)
				
			{
				if(charArray[i]>charArray[j])
				{
					temp=charArray[i];
					charArray[i]=charArray[j];
					charArray[j]=temp;
				}
			}
		}
		System.out.println(new String(charArray));
		
		// Approach 2
//		String str1= "java";
//		char ch[]=str1.toCharArray();
//		
//		Arrays.sort(ch);
//		
//		System.out.println(new String(ch));
//		
		
		// Descending order
		
		String str2= "akshay";
		char charArray1[]=str2.toCharArray();
		char temp1;
		
		for(int i=0; i<charArray1.length;i++)
		{
			for(int j=i+1;j<charArray1.length;j++)
				
			{
				if(charArray1[i]<charArray1[j])
				{
					temp1=charArray1[i];
					charArray1[i]=charArray1[j];
					charArray1[j]=temp1;
				}
			}
		}
		System.out.println(new String(charArray1));
		
	}
}
