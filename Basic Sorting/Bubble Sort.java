package Sorting;

// Implement Bubble sort.

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
		int swaps = 0;
		for (int i = 0; i < n; i++) {
		   for (int j = 0; j < n - 1; j++) {
			   if (arr[j] > arr[j + 1]) {
				   swaps++;
				   int temp = arr[j];
				   arr[j] = arr[j+1];
				   arr[j+1] = temp;
			   }
		   }
		}
		System.out.println("Array is sorted in " + swaps + " swaps.");
		System.out.println("First Element: " + arr[0]);
		System.out.println("Last Element: " + arr[n-1]);
		sc.close();
	}
}
