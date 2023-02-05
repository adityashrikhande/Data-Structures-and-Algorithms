// Given a temperature, of F in Fahrenheit, your task is to convert it into Celsius using the following equation:-

// T(°C) = (T(°F) - 32)*5/9

// Note: It is guaranteed that F - 32 will be a multiple of 9.

import java.util.*;
//import java.lang.*;
//import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int c = ((f-32)*5)/9;
        System.out.println(c);
        sc.close();
	}
}
