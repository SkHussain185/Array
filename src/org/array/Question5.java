package org.array;

import java.util.ArrayList;
import java.util.List;

public class Question5 
{
	public static void main(String[] args) 
	{
		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		
		int indexOf = a.indexOf(10); //Q.no 5.1
		System.out.println(indexOf);
		
		int lastIndexOf = a.lastIndexOf(10); //Q.no 5.2
		System.out.println(lastIndexOf);
		
		int indexOf2 = a.indexOf(50); //Q.no 5.3
		System.out.println(indexOf2);
		
	}
	

}
//Description : Get the first index value of 10 
//Input:   List = 10,20,30,90

//Description : Get the last index value of 10 
//Input:   List = 10,20,30,90,10,10,40,50

//Description : Get the index value of 50 
//Input:   List = 10,20,30,90,10,10,40,50
