package org.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Question4 
{
	public static void main(String[] args) 
	{
		List a = new Vector();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		
		System.out.println(a);
		
		int size = a.size();
		System.out.println(size);
		
	}
	

}
//Description : Create a new ArrayListlist with values and find the length of it
//Input : List = 10,20,30,90,10,10,40,50
