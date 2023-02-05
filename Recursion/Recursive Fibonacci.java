package Recursion;

// Given an integer N, find the Nth number in the fibonacci series. Consider 0 and 1 to be the seed values.

// In a fibonacci series, each number ( Fibonacci number ) is the sum of the two preceding numbers. The series with 0 and 1 as seed values will go like -

// 0, 1, 1, 2, 3, 5.....

import java.util.*;

class Main
{

	public static int fib(int n){
		if(n == 1 || n == 2){
			return n-1;
		}
		return fib(n-1) + fib(n-2);
	}
        
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.print(fib(n));
		sc.close();
	}
}
