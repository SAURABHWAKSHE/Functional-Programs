/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/Factorial.java
  *  Execution:    java -cp bin com.bridgelabz.util.Factorial
  *  
  *  Purpose:program to find Factorial no. using Static Function
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   04-10-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;


import java.util.Scanner;

public class Factorial{

public static long factorial(int n)
     {
		 int fact=1;
         while(n>0)
         {
             fact=fact*n;
             n--;
         }
         return (fact);
     }
	  public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("factorial of "+n+" is="+factorial(n));
	}
}