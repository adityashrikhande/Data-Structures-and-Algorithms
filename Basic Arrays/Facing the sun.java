
// Given an array h representing heights of buildings. You have to count the buildings which will see the sunrise (Assume : Sun rise on the side of array starting point).

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int maxi = 0;
		int cnt = 0;
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
			if (arr[i] > maxi){
				maxi = arr[i];
				cnt++;
			}
		}
		System.out.println(cnt);
        sc.close();
	}
}