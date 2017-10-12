/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/SquareRoot.java
  *  Execution:    java -cp bin com.bridgelabz.util.SquareRoot
  *  
  *  Purpose:program to find  Square Root of no. using Static Function
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   04-10-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;

import java.lang.Math;
import java.util.Scanner;


public class SquareRoot{
/*
*Static function to calculate sqrt os a no using Newton's Theorem
*/
public static double sqrt(double c)
    {
        double epsilon=1e-15;
        double t=c;
        t=(c/t+t)/2;
        while(Math.abs(t-c/t)>epsilon*t)
        {
            t=(c/t+t)/2;
        }
        return t;
    }
/*	
 * overloaded method in which user specifies the error tolerance
*/
public static double sqrt(double c,double epsilon)
    {
        double t=c;
        t=(c/t+t)/2;
        while(Math.abs(t-c/t)>epsilon*t)
        {
            t=(c/t+t)/2;
        }
        return t;
    }
public static void main(String[] args) {
	    double c;
        Scanner sc=new Scanner(System.in);
		System.out.println("Please enter an C:");
		c=sc.nextDouble();
		System.out.println("sqrt="+sqrt(c));
		System.out.println("sqrt="+sqrt(c,1e-15));
		}
		}