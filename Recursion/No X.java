package Recursion;

// Given a string, compute recursively a new string where all the x chars have been removed.

import java.util.*;

class Main
{

	public static String solve(String s, int idx){
		if(idx < 0){
			return "";
		}
		if(s.charAt(idx) == 'x'){
			return solve(s, idx-1);
		}
		return solve(s, idx-1) + (s.charAt(idx)+"");
	}
        
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		System.out.println(solve(s, n-1));
		sc.close();
	}
}
