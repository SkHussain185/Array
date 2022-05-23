package org.array;

public class Question3 
{
	public static void main(String[] args) 
	{
		int []a=new int [8];
		a[0]=10;
		a[1]=10;
		a[2]=20;
		a[3]=50;
		a[4]=60;
		a[5]=80;
		a[6]=60;
		a[7]=50;
		
		for (int i = 0; i <= a.length; i++) 
		{
			System.out.println(a[i]);
			
		}
		
		
	}

}
//Description : Write a Java program to remove duplicates from array
//Input  a[]= {10,10,20,50,60,80,60,50}
//Output a[]= {10,20,50,60,80}