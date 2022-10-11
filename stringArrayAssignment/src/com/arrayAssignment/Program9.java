package com.arrayAssignment;

public class Program9 {

	public void checkPalindrome(String arr[])
	{
		for(int k=0;k<arr.length;k++)
		{
			boolean flag=false;
			String str=arr[k];
			for(int i=0,j=str.length()-1;i<j;i++,j--)
			{
				char last=str.charAt(j);
				char first=str.charAt(i);
				if(last!=first)
				{
					flag=true;
					break;
				}
			}
			if(flag)
			{
				arr[k]="";
			}			
		}	
		for(String str:arr)
			System.out.print(" "+str);
		
	}
	public static void main(String[] args) {
		Program9 program=new Program9();
		String arr[]={"nitin","abc","aba","kjdsk","hfhf","asdsa"};
		program.checkPalindrome(arr);
	}
}
