package Recursion;

// Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

import java.util.*;

class Main
{

	public static String solve(String s, int idx){
		if(idx < 0){
			return "";
		}
		if(s.charAt(idx) == s.charAt(idx+1)){
			return  solve(s, idx-1) + s.charAt(idx) + "*";
		}
		return solve(s, idx-1) + s.charAt(idx);
	}
        
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();

        sc.close();
        
		if(n == 1){
			System.out.println(s);
			return;
		}
		System.out.println(solve(s, n-2) + s.charAt(n-1));
	}
}
