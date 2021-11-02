package com.bridgelabz;

import java.util.Scanner;

public class TwoDArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter NUmber of Columns: ");
		int cols = sc.nextInt();
		int [][] array = new int [rows][cols];
		System.out.print("Enter Array Elemets for 2D Array: ");
		for (int m = 0; m < rows; m++) 
		{
			for (int n = 0; n < cols; n++)
			{
				array[m][n] = sc.nextInt();
			}
			
		}
		
		System.out.println("2D Array of "+rows+" X "+cols+ ": ");
		for (int m = 0; m < rows; m++) 
		{
			for (int n = 0; n < cols; n++)
			{
				System.out.print(array [m][n]+"  ");
			}
			System.out.println();
		}

	}

}
