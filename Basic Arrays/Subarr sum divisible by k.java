
// Given an integer array nums and an integer k, print the number of non-empty subarrays that have a sum divisible by k.

// A subarray is a contiguous part of an array.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];

        int cnt = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }
        for(int i=1; i<n; i++){
            arr[i] += arr[i-1]; 
        }
        for(int i=-1; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if (i == -1){
                    if (arr[j]%k == 0){
                        cnt++;
                    }
                }
                else if ((arr[j]-arr[i])%k == 0){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
	}
}
