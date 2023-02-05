
// Given an unsorted array of size N with distinct elements. Find the 2nd largest element from the array without sorting the array.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int maxi = -100000;
		int smax = -100000;
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
			if (arr[i] > maxi){
				smax = maxi;
				maxi = arr[i];        
			}else if(arr[i] > smax){
				smax = arr[i];
			}
		}
		System.out.println(smax);
        sc.close();
	}
}
