package org.array;

import java.util.ArrayList;
import java.util.List;

public class Question7 
{
	public static void main(String[] args) 
	{
		List a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		
		
		 a.remove(2);
	//	System.out.println(remove);
		System.out.println(a);
		
	}

}
//Description : Remove the value present at 2nd index
//Input:   List = 10,20,30,40,50,60
