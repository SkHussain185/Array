package org.array;

import java.util.ArrayList;
import java.util.List;

public class Question6 
{
	public static void main(String[] args) 
	{
		List a = new ArrayList (6);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
	
		Object object = a.get(2);  //6.1
		System.out.println(object);
		
		for (int i = 0; i < 1; i++) 
		{
			System.out.println(a);
			
		}
		for (Object d : a) 
		{
			System.out.println(d);
		}
		
		
	}
}
//Description : Get the value present at 2nd index
//Input:   List = 10,20,30,40,50,60

//QUESTION 6.4:
//--------------
//Description : Get the each value of list by using normal for loop
//              Input:   List = 105,205,305,405,505,605,705,805
