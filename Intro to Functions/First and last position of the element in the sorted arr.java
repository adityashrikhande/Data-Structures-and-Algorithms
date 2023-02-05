
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, print[-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		int arr[] = new int[n];
		int flag = 0;
		for(int i=0; i<n; i++){
				arr[i] = sc.nextInt();
		}
		flag  = 0;
		int l = 0;
		int r = n-1;
		while(l < r){
			int mid = l + (r-l)/2;
			if(arr[mid] == target){
				flag = 1;
			}
			if(arr[mid] >= target){
				r = mid;
			}else{
				l = mid+1;
			}
		}
		int a1 = r;
		l = 0;
		r = n-1;
		while(l < r){
			int mid = l + (r-l)/2;
			if(arr[mid] == target){
				flag = 1;
			}
			if(arr[mid] > target){
				r = mid;
			}else{
				l = mid+1;
			}
		}
		int a2 = r-1;
		if (flag == 0){
			System.out.println(-1 + " " + -1);
		}else{
			System.out.println(a1 + " " + a2);
		}
		sc.close();
	}
}
