package Quick_sort_and_Mergesort;

// Given an array A[] of size N, containing positive integers. You need to sort the elements of array using the merge sort algorithm.

import java.util.*;

class Main
{

	public static void merge(int[] arr, int low, int mid, int high, int temp[]){
			
		int l = low;
		int r = mid;
		int k = low;

		while(l < mid && r <= high){
			if(arr[l] > arr[r]){
				temp[k++] = arr[r++];
			}else{
				temp[k++] = arr[l++];
			}
		}
		while(l < mid){
			temp[k++] = arr[l++];
		}
		while(r <= high){
			temp[k++] = arr[r++];
		}
		for(int i=low; i<=high; i++){
			arr[i] = temp[i];
		}
	}

	public static void mergeSort(int[] arr, int l, int r, int[] ans){
		if(l == r){
			return;
		}
		int mid = l + (r-l)/2;
		
		mergeSort(arr, l, mid, ans);
		mergeSort(arr, mid+1, r, ans);

		merge(arr, l, mid+1, r, ans);
			
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
		int[] ans = new int[n];
		mergeSort(arr, 0, n-1, ans);
		for(int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
		}
        sc.close();
	}
}
