
// Given a string s and an integer array indices of the same length.

// The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

// Print the shuffled string.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char arr[] = new char[n];
		String s = sc.next();
		for(int i=0; i<n; i++){
				int x = sc.nextInt();
				arr[x] = s.charAt(i);
		}
		System.out.print(arr);
		sc.close();
	}
}
