/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/Calender.java
  *  Execution:    java -cp bin com.bridgelabz.util.Calender
  *  
  *  Purpose: Compound Future
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   05-10-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;

 import java.io.*;
 import java.util.*;
 public class Calender{

    // return true if the given year is a leap year
    public static boolean isLeapYear(int year) {
        if  ((year % 4 == 0) && (year % 100 != 0)) return true;
        if  (year % 400 == 0) return true;
        return false;
    }
public static int day(int month, int day, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31*m)/12) % 7;
        return d;
    }
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);    
        int year = Integer.parseInt(args[1]);     

        
        String[] months = {
            "",                               // leave empty so that months[1] = "January"
            "January", "February", "March",
            "April", "May", "June",
            "July", "August", "September",
            "October", "November", "December"
        };

        // days[i] = days in month i
        int[] days = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        // check for leap year
        if (month == 2 && isLeapYear(year)) days[month] = 29;


        
        System.out.println("   " + months[month] + " " + year);
        System.out.println(" S  M  T  W  T  F  S");

        // starting day
        int d = day(month, 1, year);

        // print the calendar
        for (int i = 0; i < d; i++)
            System.out.print("   ");
        for (int i = 1; i <= days[month]; i++) {
            System.out.print("  "+i);
            if (((i + d) % 7 == 0) || (i == days[month])) System.out.println();
        }

    }
}
