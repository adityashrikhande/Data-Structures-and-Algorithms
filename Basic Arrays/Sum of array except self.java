
// Given an array of n integers where n > 1, return an array output such that output[i] is equal to the sum of all the elements of nums except nums[i]. All integers in array are greater than 0.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long[] arr = new Long[n];
		long sum = 0;
		for(int i=0; i<n; i++){
			arr[i] = sc.nextLong();
			sum += arr[i];
		}
		for(int i=0; i<n; i++){
			System.out.print(sum-arr[i] + " ");
		}
        sc.close();      
	}
}
