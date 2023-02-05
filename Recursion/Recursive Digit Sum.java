package Recursion;

// Given an integer, we need to find the super digit of the integer n which is concatenated k times.

// We define super digit of an integer n using the following rules:

// If n has only 1 digit, then its super digit is n.

// Otherwise, the super digit of n is equal to the super digit of the sum of the digits of n.

import java.util.*;

class Main
{

	public static int solve(String n){
		if(Integer.valueOf(n) < 10){
			return Integer.valueOf(n);
		}
		int sum = 0;
		for(int i=0; i<n.length(); i++){
			sum += n.charAt(i)- '0';
		}
		return solve(Integer.toString(sum));
	}
        
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int k = sc.nextInt();
		int sum = 0;
		for(int i=0; i<num.length(); i++){
			sum += num.charAt(i)- '0';
		}
		int temp = 0;
		for(int i=0; i<k; i++){
			temp += sum;
		}
		int ans = solve(""+temp);
		System.out.println(ans);
        sc.close();
	}
}
