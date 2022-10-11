package com.arrayAssignment;

import java.util.Scanner;

public class Program8 {
	public void printMatrix()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter row value:");
		int row=scanner.nextInt();
		System.out.println("Enter column value:");
		int column=scanner.nextInt();
		int arr[][]=new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.println("Enter value of arr["+i+"]["+j+"]:");
				arr[i][j]=scanner.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if((i==0)||(j==0)||(i==row-1)||(j==column-1))
				{
					System.out.print(" "+arr[i][j]);
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Program8 program=new Program8();
		program.printMatrix();
	}
}
