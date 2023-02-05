
// Given the temperature of a city in celsius, your task is to convert the temperature to Fahrenheit and return it.

// Note: It is guaranteed that the temperature in celsius, C, will be a multiple of 5.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
	    Scanner sc = new Scanner(System.in);
	    int C = sc.nextInt();
	    
	    int f = (C*9)/5 + 32;
	    System.out.println(f);
        sc.close();
	}
}
