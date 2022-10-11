package com.arrayAssignment;

public class Program2 {
	public void printRepeatedNumber(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			int num=arr[i];
			count=1;
			if(num>0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(num==arr[j])
					{
						count++;
						arr[j]=-1;
					}
				}
				System.out.println(num+" :"+count);
			}
			
		}
	}
	public static void main(String[] args) {
		Program2 program=new Program2();
		int arr[]={1,4,6,2,76,2,1,3,2,4,1};
		program.printRepeatedNumber(arr);
		
	}
}
