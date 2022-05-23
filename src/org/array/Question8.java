package org.array;

import java.util.ArrayList;
import java.util.List;

public class Question8 
{
	  private void m1()
        {
         m2();
         System.out.printf("1");
        }
    private void m2()
       {
         m3();
         System.out.printf("2");
        }
  private void m3()
      {
         System.out.printf("3");
     try
    {
       int sum = 4/0;
       System.out.printf("4");
          }
 catch(ArithmeticException e)
 {
      System.out.printf("5");
 }
   
      System.out.printf("7");
       }
   public static void main(String[] args)
    {
       Question8 obj = new Question8();
      obj.m1();
      }
}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		





















		
		
//		List a = new ArrayList ();
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(90);
//		a.add(10);
//		
////		a.add(2,"50");
////		System.out.println(a);
////		
//		a.add(5, 70);
//		System.out.println(a);
//	}
	



//Description : Add a value 50 in the 2nd index and display the list after adding.
//Input : List = 10,20,30,90,10,10,40,50
