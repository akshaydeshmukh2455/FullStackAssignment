package com.arrayAssignment;

public class Program11 {
	public void swapStringUsingLength(String arr[])
	{
		String temp="";
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j].length()<arr[i].length())
                {
                	temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
			}
		}
		for(String str:arr)
		{
			System.out.print(" "+str);
		}
	}
	public static void main(String[] args) {
		Program11 program=new Program11();
		String arr[]={"nitin","abc","aba","kjdskgg","hfhf","asdsa","a"};
		program.swapStringUsingLength(arr);
	}
}
