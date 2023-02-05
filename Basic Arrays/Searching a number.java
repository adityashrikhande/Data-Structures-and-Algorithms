
// Given an array Arr of N elements and a integer K. Your task is to print the position of first occurrence of K in the given array. If the number is not found, print -1.

// Note: Position of first element is considered as 1.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		int position = -2;
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
			if (arr[i] == k){
				position = i;
				break;
			}
		}
		System.out.print(position+1);
        sc.close();
	}
}
