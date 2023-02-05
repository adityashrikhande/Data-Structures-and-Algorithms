
// Given an array of integers, arr, and a positive integer k, determine the number of (i,j) pairs in the array where i<j and arr[i] + arr[j] is divisible by k.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here  
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int cnt = 0;
    int arr[] = new int[n];  
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        if ((arr[i]+arr[j])%k == 0){
          cnt++;
        }
      }
    }
    System.out.println(cnt);
    sc.close();
	}
}
