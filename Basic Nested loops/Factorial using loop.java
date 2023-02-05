
//Find the factorial of a given number where n! = n * n-1 * n-2 .....* 1.

import java.util.*;
//import java.lang.*;
//import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long fact = 1;
    for(int i=n; i>1; i--){
      fact *= i;
    }
    System.out.println(fact);
    sc.close();
    }
}
