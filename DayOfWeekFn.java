/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/DayOfWeekFn.java
  *  Execution:    java -cp bin com.bridgelabz.util.DayOfWeekFn
  *  
  *  Purpose:program to find Day Of Week no. using Static Function
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   05-10-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;

public class DayOfWeekFn {
public static int day(int month, int day, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31*m)/12) % 7;
        return d;
    } 
	public static void main(String[] args) {
	   int month=Integer.parseInt(args[0]);
		int day=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		int d=day(month,day,year);
		switch(d){
		case 0:System.out.println("day is sunday");break;
		case 1:System.out.println("day is monday");break;
		case 2:System.out.println("day is tuesday");break;
		case 3:System.out.println("day is wednesday");break;
		case 4:System.out.println("day is thursday");break;
		case 5:System.out.println("day is friday");break;
		case 6:System.out.println("day is saturday");break;
		}
		}
		}