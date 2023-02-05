
// Given the marks of n students, your task is to take input of marks, calculate the average of the marks obtained and print it.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println(sum/n);
        sc.close();
	}
}
