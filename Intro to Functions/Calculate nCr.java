
// Given n and r, your task is to calculate nCr.

// Here nCr is the total number of ways for selecting r elements out of n options are nCr = (n!) / (r! * (n-r)!) where n! = 1 * 2 * . . . * n.

import java.util.*;

class Main
{
	public static long fact(int n){
		long ans = 1;
		for(int i=2; i<=n; i++){
			ans *= i;
		}
		return ans;
	}
        
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();

		long ans = fact(n)/(fact(r)*fact(n-r));
		System.out.println(ans);
		sc.close();
	}
}
