package Recursion;

// You will be given an array of N integers. Write a recursive function to calculate its summation.

import java.util.*;

class Main
{

	public static int Recursion(int[] arr, int n){
		if(n < 0){
			return 0;
		}
		return arr[n] + Recursion(arr, n-1);
	}
        
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for(int k=0; k<t; k++){
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++){
					arr[i] = sc.nextInt();
			}
			System.out.println("Case " + (k+1) + ": " + Recursion(arr, n-1));
			sc.close();
		}  
	}
}
