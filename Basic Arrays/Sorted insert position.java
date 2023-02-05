
// Given a sorted array A and a target value B, return the index if the target is found. If not, print the index where it would be if it were inserted in order.

// You may assume no duplicates in the array.

import java.util.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        
        for (int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        int B = sc.nextInt();
        
        int index=n;
        for (int i=0;i<n;i++)
        {
            if (arr[i]>= B)
            {
                index=i;
                break;
            }
        }
        System.out.println(index);
        sc.close();
	
	}
}
