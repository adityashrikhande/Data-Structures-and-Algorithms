package Recursion;

// Given an array of integers. Compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in the index as 0.

import java.util.*;

class Main
{

	public static int solve(int arr[], int idx){
		if(idx < 0){
			return 0;
		}
		if(arr[idx] == 11){
			return 1 + solve(arr, idx-1);
		}
		return solve(arr, idx-1);
	}
        
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
		}

		int ans = solve(arr, n-1);
		System.out.println(ans);
		sc.close();
	}
}
