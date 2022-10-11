package com.arrayAssignment;

public class Program1 {
	public static void main(String[] args) {
		int temp,num;
		int array[]= {11,25,37,80,90};
		num=array.length;
		
		for(int i=0;i<num;i++)
		{
			for(int j=i+1;j<num;j++)
				
			{
				if(array[i]==array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("Third largest number is: "+array[num-3]);
	}
}
