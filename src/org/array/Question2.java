package org.array;

public class Question2 
{
	public static void main(String[] args) 
	{
		int a[]=new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		a[7]=8;
		a[8]=9;
		a[9]=10;
		int sum=0;
		int terms=0;
		float c=0;
		for (int i = 0; i <= a.length; i++) 
		{
			sum = sum+i;
			terms++;
			c=sum/terms;
		}
		{
		System.out.println(c);
		}
	}
	

}
//Description : Write a Java program to calculate the average value of array elements.
//Input a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
//Output   = average = 7.0 
