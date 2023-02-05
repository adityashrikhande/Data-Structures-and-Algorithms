
// Given a string S consisting only 0s and 1s, find the last index of the 1 present in it.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int idx = -1;
		for(int i=0; i<n; i++){
			if (s.charAt(i) == '1'){
				idx = i;
			}
		}
		System.out.println(idx);
		sc.close();
	}
}
