package Sorting;

// You are given an array arr of length n. You have to print the maximum product of any three elements present in the array.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		long ans = 1;
		if(arr[0] < 0 && arr[1] < 0){
			ans = arr[0]*arr[1]*arr[n-1];
		}
		ans = Math.max(ans, arr[n-1]*arr[n-2]*arr[n-3]);
		System.out.println(ans);
        sc.close();
	}
}
