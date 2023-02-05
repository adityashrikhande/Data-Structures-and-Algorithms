package Sorting;

// Given the array of integers arr of size N, you will choose two different indices i and j of that array. Return the maximum value of nums[i]-1)*(nums[j]-1).

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
		System.out.println((arr[n-1]-1)*(arr[n-2]-1));
        sc.close();
	}
}