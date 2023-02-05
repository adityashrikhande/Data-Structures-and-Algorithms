// Given the number of the month, your task is to calculate the number of days present in the particular month.

// Note:- Consider non-leap year.


import java.util.*;
//import java.lang.*;
//import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    if (m == 2){
      System.out.println("28");
    }else if(m <= 7){
      if (m%2 == 0){
        System.out.println("30");
      }else{
        System.out.println("31");
      }
    }else{
      if (m%2 == 0){
        System.out.println("31");
      }else{
        System.out.println("30");
      }
    }
    sc.close();
	}
}