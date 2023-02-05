package Recursion;

// Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

// countAbc("abc") → 1

// countAbc("abcxxabc") → 2

// countAbc("abaxxaba") → 2

import java.util.*;

class Main
{

	public static int solve(String s, int idx){
		if(idx < 2){
			return 0;
		}
		if((s.charAt(idx) == 'c' || s.charAt(idx) == 'a') && s.charAt(idx-1) == 'b' && s.charAt(idx-2) == 'a'){
			return 1 + solve(s, idx-2);
		}
		return solve(s, idx-1);
	}
        
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int ans = solve(s, n-1);
		System.out.println(ans);
		sc.close();
	}
}
