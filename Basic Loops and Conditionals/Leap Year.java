
// Given a year, find if it is a leap year.

// A Leap year is the year that is multiple of 4. However, multiples of 100 except for the multiples of 400 are not leap years.

// Your task is to complete the function isLeapYear which receives the year as its parameter and returns 1 or 0 depending upon if the year is a leap year or not.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
	    Scanner sc = new Scanner(System.in);
	    int year = sc.nextInt();
	    
	    if (year%4 == 0){
	      if (year%400 == 0){
	        System.out.println(1);
	      }else if(year%100 == 0){
	        System.out.println(0);
	      }else{
	        System.out.println(1);
	      }
	    }else{
	      System.out.println(0);
	    }
	    sc.close();
	}
}
