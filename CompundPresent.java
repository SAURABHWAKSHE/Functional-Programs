/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/CompundPresent.java
  *  Execution:    java -cp bin com.bridgelabz.util.CompundPresent
  *  
  *  Purpose:program to find amount to be deposited to get certain amt after some years
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   05-10-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;
 
 import java.util.Scanner;
 
 class CompundPresent
{
    public static double presentValue(double C,double r,double  T)
    {
        
        return C/Math.pow(1+r,T);
    }
	  public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
		System.out.println("please enter the compound invest ,time and rate of interest");
			double C=in.nextDouble();
		 	double T=in.nextDouble();
		   double r=in.nextDouble();
			System.out.println("Compound="+presentValue(C, r, T));
			}
			}