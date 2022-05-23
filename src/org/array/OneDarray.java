package org.array;

import java.util.Iterator;

public class OneDarray 
{
	public static void main(String[] args) 
	{
		int[] a =new int[5];
		a[0]=5;
		a[1]=10;
		a[2]=20;
		a[3]=30;
		a[4]=40;
		
		int length = a.length;
		System.out.println(length);
	
		for (int i = 0; i < a.length; i++) 
		{
		
		 System.out.println(a[i]);
		}
		for (int i : a) 
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int a[]=new int[5];
//		a[0]=10;
//		a[1]=20;
//        a[2]=30;
//        a[3]=40;
//        a[4]=50;
//        a[1]=100;
//        a[2]=200;
//      //  a[5]=60;
//        
// //       int length = a.length;
// //       System.out.println(length);
        
//        for (int j = 0; j < a.length; j++) 
//        {
//        	System.out.println(a[j]);
//			
//		}
//           for (int i : a)
//           {
//			System.out.println(i);
//		}
	}

}

