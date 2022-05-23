package org.array;

public class TwoDarray 
{
	public static void main(String[] args) 
	{
		int a[][]=new int [2][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				System.out.println(a[i][j]);
				
			}
			
		}
		
				
	
		
	}

}
