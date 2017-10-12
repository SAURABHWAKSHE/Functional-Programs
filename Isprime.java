/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/Isprime.java
  *  Execution:    java -cp bin com.bridgelabz.util.Isprime
  *  
  *  Purpose:program to find  prime no. using Static Function
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   04-10-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;

public class Isprime{
public static boolean isPrime(int N)
	{
		int counter=0;
		if(N==1 && N==0)
			return false;
		else
		{
                  /*
                   *if no. is divisible by 1 and that no. itself then it is prime no
                  */
			for(int i=1;i<=N;i++)
			{
				if(N%i==0)
					counter++;
			}
			if(counter==2)
				return true;
		}
		return false;
	}
	public static void main(String[]args){
                   /*
                   *Accepting input from command line
                  */
	int N=Integer.parseInt(args[0]);
	System.out.println("Result="+isPrime(N));
	}
	}