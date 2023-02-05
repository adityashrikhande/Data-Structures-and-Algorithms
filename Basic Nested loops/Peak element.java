
// An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).

// For first and last element consider only the element next to it.

// Given an array arr[] of size n, find the index of first peak element.

// If peak element does not exist print -1.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
        }
        sc.close();
        if (n == 1){
                System.out.println(-1);
                return;
        }
        if ((n > 1) && (arr[0] > arr[1])){
                System.out.println(0);
                return;
        }
        for(int i=1; i<n-1; i++){
                if (arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                        System.out.println(i);
                        return;
                }
        }
        if ((n > 1) && (arr[n-1] > arr[n-2])){
                System.out.println(n-1);
                return;
        }
        
	}
}
